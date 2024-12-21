from graphviz import Digraph

# Diagramme relationnel (base de données)
relation_diagram = Digraph("RelationDiagram", format="png")
relation_diagram.attr(rankdir="TB")

# Tables de la base de données
relation_diagram.node("Products", shape="record", label="{Products|+ id: INT (PK)\\l+ name: VARCHAR\\l+ price: DOUBLE\\l+ category: VARCHAR\\l+ stock: INT\\l}")
relation_diagram.node("Customers", shape="record", label="{Customers|+ id: INT (PK)\\l+ name: VARCHAR\\l+ email: VARCHAR\\l+ address: VARCHAR\\l}")
relation_diagram.node("Orders", shape="record", label="{Orders|+ id: INT (PK)\\l+ customerId: INT (FK)\\l+ status: VARCHAR\\l}")
relation_diagram.node("OrderDetails", shape="record", label="{OrderDetails|+ orderId: INT (FK)\\l+ productId: INT (FK)\\l+ quantity: INT\\l}")
relation_diagram.node("Invoices", shape="record", label="{Invoices|+ id: INT (PK)\\l+ orderId: INT (FK)\\l+ totalAmount: DOUBLE\\l+ date: DATE\\l}")

# Relations entre les tables
relation_diagram.edge("Customers", "Orders", label="1:N", arrowhead="crow")
relation_diagram.edge("Orders", "OrderDetails", label="1:N", arrowhead="crow")
relation_diagram.edge("Products", "OrderDetails", label="1:N", arrowhead="crow")
relation_diagram.edge("Orders", "Invoices", label="1:1", arrowhead="vee")

relation_diagram_path = "/mnt/c/Users/LB/Documents/Tout/RelationDiagram.png"
relation_diagram.render(relation_diagram_path, cleanup=True)

relation_diagram_path
