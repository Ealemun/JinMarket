from graphviz import Digraph

# Diagramme de classes
class_diagram = Digraph("ClassDiagram", format="png")
class_diagram.attr(rankdir="TB")

# Définition des classes
class_diagram.node("Product", shape="record", label="{Product|+ id: int\\l+ name: String\\l+ price: double\\l+ category: String\\l+ stock: int\\l}")
class_diagram.node("Customer", shape="record", label="{Customer|+ id: int\\l+ name: String\\l+ email: String\\l+ address: String\\l}")
class_diagram.node("Order", shape="record", label="{Order|+ id: int\\l+ customerId: int\\l+ status: String\\l+ products: List<Product>\\l}")
class_diagram.node("Invoice", shape="record", label="{Invoice|+ id: int\\l+ orderId: int\\l+ totalAmount: double\\l+ date: Date\\l}")

# Relations
class_diagram.edge("Customer", "Order", label="1..*", arrowhead="vee")
class_diagram.edge("Order", "Product", label="1..*", arrowhead="vee")
class_diagram.edge("Order", "Invoice", label="1", arrowhead="vee")

class_diagram_path = "/mnt/c/Users/LB/Documents/Tout/ClassDiagram.png"
class_diagram.render(class_diagram_path, cleanup=True)

class_diagram_path