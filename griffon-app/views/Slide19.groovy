import net.miginfocom.swing.MigLayout
import javax.swing.SwingConstants
import com.bric.image.transition.Transition2D
import com.bric.image.transition.vanilla.BlendTransition2D
import groovy.beans.Bindable

def script = '''button('Light')
button('Heavy', actionPerformed: { sleep 5000 } )'''

container(new SlidePanel(footer: createFooter(count)), layout: editorLayout()) {
  label("EDT上で時間の掛かる", cssClass: "title", constraints: "center, wrap")
  label("処理をするのはよろしくない", cssClass: "title", constraints: "center, wrap")
  label("イベントディスパッチスレッドがブロックされ、", cssClass: "desc", constraints: "wrap")
  label("入力を受け付けずにフリーズした状態になる", cssClass: "desc", constraints: "wrap")
  panel(cssClass: "desc", constraints: "wrap") {
      button('Light', cssClass: "desc")
      button('Heavy', cssClass: "desc", actionPerformed: { sleep 5000 } )
  }
  scrollPane(constraints: "grow") {
    widget(createEditor(text: script, editable: true, runnable: true))
  }
}