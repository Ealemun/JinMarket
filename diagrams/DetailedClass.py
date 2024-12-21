from graphviz import Digraph

# Diagramme de classes enrichi et détaillé pour un contexte Java avec héritage et niveaux de visibilité
detailed_class_diagram = Digraph("DetailedClassDiagram", format="png")
detailed_class_diagram.attr(rankdir="TB")

# Définition des classes enrichies avec héritage et visibilité
detailed_class_diagram.node("Product", shape="record", label="{Product|# id: int\\l# name: String\\l# price: double\\l# category: String\\l# stock: int\\l# description: String\\l# imageUrl: String\\l|+ isAvailable(): boolean\\l+ updateStock(quantity: int): void\\l}")
detailed_class_diagram.node("Customer", shape="record", label="{Customer|# id: int\\l# name: String\\l# email: String\\l# address: String\\l# phoneNumber: String\\l# createdAt: Date\\l|+ updateAddress(newAddress: String): void\\l+ getOrderHistory(): List<Order>\\l}")
detailed_class_diagram.node("Order", shape="record", label="{Order|# id: int\\l# customerId: int\\l# status: String\\l# orderDate: Date\\l# totalAmount: double\\l|+ calculateTotal(): double\\l+ addProduct(product: Product, quantity: int): void\\l+ removeProduct(product: Product): void\\l+ updateStatus(newStatus: String): void\\l}")
detailed_class_diagram.node("Invoice", shape="record", label="{Invoice|# id: int\\l# orderId: int\\l# totalAmount: double\\l# date: Date\\l# paymentMethod: String\\l# paid: boolean\\l|+ generatePDF(): File\\l+ markAsPaid(): void\\l}")

# Ajout d'une classe abstraite ou super-classe pour les entités communes
detailed_class_diagram.node("BaseEntity", shape="record", label="{BaseEntity|# id: int\\l|+ getId(): int\\l+ setId(id: int): void\\l}")

# Ajout d'héritage
detailed_class_diagram.edge("BaseEntity", "Product", arrowhead="onormal")
detailed_class_diagram.edge("BaseEntity", "Customer", arrowhead="onormal")
detailed_class_diagram.edge("BaseEntity", "Order", arrowhead="onormal")
detailed_class_diagram.edge("BaseEntity", "Invoice", arrowhead="onormal")

# Relations entre les classes
detailed_class_diagram.edge("Customer", "Order", label="1..*", arrowhead="vee")
detailed_class_diagram.edge("Order", "Product", label="1..*", arrowhead="vee")
detailed_class_diagram.edge("Order", "Invoice", label="1", arrowhead="vee")

# Générer le diagramme détaillé
detailed_class_diagram_path = "/mnt/c/Users/LB/Documents/Tout/DetailedClassDiagram.png"
detailed_class_diagram.render(detailed_class_diagram_path, cleanup=True)

detailed_class_diagram_path