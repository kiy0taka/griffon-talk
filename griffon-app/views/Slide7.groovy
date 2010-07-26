import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
  label("プロジェクト構成", cssClass: "title", constraints: "center, wrap")
  label(icon: imageIcon(resource: "project-layout.png", class: DeckView), cssClass: "desc", constraints: "center, wrap")
}