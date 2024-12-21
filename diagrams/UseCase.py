from graphviz import Digraph

# Diagramme de cas d'utilisation
use_case_diagram = Digraph("UseCase", format="png")
use_case_diagram.attr(rankdir="LR")

# Acteurs
use_case_diagram.node("Client", shape="ellipse", label="Client")
use_case_diagram.node("System", shape="ellipse", label="Système")

# Cas d'utilisation
use_case_diagram.node("AfficherCatalogue", shape="ellipse", label="Afficher le catalogue")
use_case_diagram.node("RechercherProduit", shape="ellipse", label="Rechercher un produit")
use_case_diagram.node("GererClients", shape="ellipse", label="Gérer les clients")
use_case_diagram.node("PasserCommande", shape="ellipse", label="Passer une commande")
use_case_diagram.node("GenererFacture", shape="ellipse", label="Générer une facture")
use_case_diagram.node("ModifierDonnees", shape="ellipse", label="Modifier/Supprimer des données")

# Liens
use_case_diagram.edge("Client", "AfficherCatalogue")
use_case_diagram.edge("Client", "RechercherProduit")
use_case_diagram.edge("Client", "PasserCommande")
use_case_diagram.edge("Client", "GenererFacture")
use_case_diagram.edge("System", "GererClients")
use_case_diagram.edge("System", "ModifierDonnees")

use_case_path = "/mnt/c/Users/LB/Documents/Tout/UseCaseDiagram.png"
use_case_diagram.render(use_case_path, cleanup=True)

print(use_case_path)