import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
  label("Bindableとbind", cssClass: "title", constraints: "center, wrap")
  label("ViewとModelの間で変更を通知し合う仕組み", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label('Modelのプロパティが変更されたらViewに反映する', cssClass: "desc", constraints: "wrap")
  label('Viewで入力された値をModelのプロパティに反映する', cssClass: "desc", constraints: "wrap")
}