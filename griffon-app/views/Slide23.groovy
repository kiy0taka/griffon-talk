import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
  label("MVCグループ", cssClass: "title", constraints: "center, wrap")
  label("ModelとViewとController", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("    Application.groovyで定義されている", cssClass: "desc", constraints: "wrap")
  label("create-app Hoge", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("    Hogeグループが作成される", cssClass: "desc", constraints: "wrap")      
  label("      HogeModel.groovy", cssClass: "desc", constraints: "wrap")
  label("      HogeView.groovy", cssClass: "desc", constraints: "wrap")
  label("      HogeController.groovy", cssClass: "desc", constraints: "wrap")
  label("create-mvc Foo", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("    Fooグループが作成される", cssClass: "desc", constraints: "wrap")      
  label("      FooModel.groovy", cssClass: "desc", constraints: "wrap")
  label("      FooView.groovy", cssClass: "desc", constraints: "wrap")
  label("      FooController.groovy", cssClass: "desc", constraints: "wrap")
}