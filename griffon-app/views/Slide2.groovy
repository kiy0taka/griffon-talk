import net.miginfocom.swing.MigLayout
import groovy.beans.Bindable

class Slide2Model {
    @Bindable Date now
}

def model = new Slide2Model()

doOutside {
    while (true) {
        edt {
            model.now = new Date()
        }
        sleep 128
    }
}

container(new SlidePanel(footer: createFooter(count)),layout: new MigLayout("fill","5%[left]5%","[center]")) {
    label("年齢", cssClass: "title", constraints: "center, wrap")
    label(text:bind(source:model, 'now', converter:{it.format('31歳とHH時間mm分ss.SSS秒')}), cssClass: "desc", constraints: "wrap")
}
