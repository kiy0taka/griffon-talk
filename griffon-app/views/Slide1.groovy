import net.miginfocom.swing.MigLayout
import com.bric.image.transition.Transition2D
import com.bric.image.transition.spunk.StarsTransition2D

transition = new StarsTransition2D(Transition2D.LEFT)

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
    label("自己紹介", cssClass: "title", constraints: "center, wrap")
    label("奥清隆(id:kiy0taka)", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
          cssClass: "desc", constraints: "wrap")
    label("JGGUG関西支部", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
          cssClass: "desc", constraints: "wrap")
    label("株式会社クロノス", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
            cssClass: "desc", constraints: "wrap")
    label("http://d.hatena.ne.jp/kiy0taka", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
          cssClass: "desc", constraints: "wrap")
    label("@kiy0taka", icon: imageIcon(resource: "griffon-icon-24x24.png", class: DeckView),
          cssClass: "desc", constraints: "wrap")
}