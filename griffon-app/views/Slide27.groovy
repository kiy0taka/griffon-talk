import net.miginfocom.swing.MigLayout

container(new SlidePanel(footer: createFooter(count)), layout: new MigLayout("fill","[center]","20%[center]5%[center]2%[center]20%")) {
  label("ご清聴ありがとうございました。", cssClass: "desc", constraints: "center, wrap")
}