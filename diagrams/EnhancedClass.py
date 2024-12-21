from graphviz import Digraph

# Diagramme de classes amélioré avec des attributs et méthodes supplémentaires
enhanced_class_diagram = Digraph("EnhancedClassDiagram", format="png")
enhanced_class_diagram.attr(rankdir="TB")

# Définition des classes enrichies
enhanced_class_diagram.node("Product", shape="record", label="{Product|+ id: int\\l+ name: String\\l+ price: double\\l+ category: String\\l+ stock: int\\l+ description: String\\l+ imageUrl: String\\l|+ isAvailable(): boolean\\l+ updateStock(quantity: int): void\\l}")
enhanced_class_diagram.node("Customer", shape="record", label="{Customer|+ id: int\\l+ name: String\\l+ email: String\\l+ address: String\\l+ phoneNumber: String\\l+ createdAt: Date\\l|+ updateAddress(newAddress: String): void\\l+ getOrderHistory(): List<Order>\\l}")
enhanced_class_diagram.node("Order", shape="record", label="{Order|+ id: int\\l+ customerId: int\\l+ status: String\\l+ orderDate: Date\\l+ totalAmount: double\\l|+ calculateTotal(): double\\l+ addProduct(product: Product, quantity: int): void\\l+ removeProduct(product: Product): void\\l+ updateStatus(newStatus: String): void\\l}")
enhanced_class_diagram.node("Invoice", shape="record", label="{Invoice|+ id: int\\l+ orderId: int\\l+ totalAmount: double\\l+ date: Date\\l+ paymentMethod: String\\l+ paid: boolean\\l|+ generatePDF(): File\\l+ markAsPaid(): void\\l}")

# Relations
enhanced_class_diagram.edge("Customer", "Order", label="1..*", arrowhead="vee")
enhanced_class_diagram.edge("Order", "Product", label="1..*", arrowhead="vee")
enhanced_class_diagram.edge("Order", "Invoice", label="1", arrowhead="vee")

# Générer le diagramme
enhanced_class_diagram_path = "/mnt/c/Users/LB/Documents/Tout/EnhancedClassDiagram.png"
enhanced_class_diagram.render(enhanced_class_diagram_path, cleanup=True)

enhanced_class_diagram_path
