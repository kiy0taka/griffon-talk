import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
  label("Griffonなう。", cssClass: "title", constraints: "center, wrap")
  label("この資料はGriffonでできています。", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("元ネタ:", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
  label("http://github.com/aalmiray/griffon-talk", cssClass: "desc", constraints: "wrap")
  label("資料公開はどうしよう。。。", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
        cssClass: "desc", constraints: "wrap")
}