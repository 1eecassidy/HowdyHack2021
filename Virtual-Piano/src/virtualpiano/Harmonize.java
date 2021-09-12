package virtualpiano;
import resources.SimpleAudioPlayer;
import java.awt.event.*;
import java.util.HashMap; // import the HashMap class

public class Harmonize 
{
    private HashMap<Integer, Integer> map = new HashMap<>();
    private int[] randomStuff = {KeyEvent.VK_A, KeyEvent.VK_Z, KeyEvent.VK_S, KeyEvent.VK_X, KeyEvent.VK_C, KeyEvent.VK_F, KeyEvent.VK_V, KeyEvent.VK_G, KeyEvent.VK_B, KeyEvent.VK_Q, KeyEvent.VK_2, KeyEvent.VK_W, KeyEvent.VK_3, KeyEvent.VK_E, KeyEvent.VK_4, KeyEvent.VK_R, KeyEvent.VK_T, KeyEvent.VK_6, KeyEvent.VK_Y, KeyEvent.VK_7, KeyEvent.VK_U, KeyEvent.VK_I, KeyEvent.VK_9, KeyEvent.VK_O, KeyEvent.VK_0, KeyEvent.VK_P, KeyEvent.VK_MINUS, KeyEvent.VK_OPEN_BRACKET, KeyEvent.VK_CLOSE_BRACKET, KeyEvent.VK_H, KeyEvent.VK_N, KeyEvent.VK_J, KeyEvent.VK_M, KeyEvent.VK_COMMA, KeyEvent.VK_L, KeyEvent.VK_PERIOD, KeyEvent.VK_SEMICOLON, KeyEvent.VK_SLASH, KeyEvent.VK_QUOTE};
    int keycodereal;

    public Harmonize(int keycode)
    {
        keycodereal = keycode;
        for (int x = 0; x < randomStuff.length; x++)
        {
            map.put(randomStuff[x], x-3);
        }
    }
    
    public void Harmonizer(int x)
    {
        if (x == 0)

        {try
        {
            SimpleAudioPlayer player = new SimpleAudioPlayer("src/resources/" + ""+((int)map.get(keycodereal)+4) + ".wav");
            SimpleAudioPlayer player1 = new SimpleAudioPlayer("src/resources/" + ""+((int)map.get(keycodereal)+7) + ".wav");
            player.play();
            player1.play();
            // System.out.println("hellloooo");
            // System.out.println(keycodereal);
            // System.out.println(map.get(keycodereal));
            // System.out.println("src/resources/" + ""+((int)map.get(keycodereal)+3) + ".wav");
        }
        catch (Exception ex) {}}

        if (x == 1)

        {try
        {
            SimpleAudioPlayer player = new SimpleAudioPlayer("src/resources/" + ""+((int)map.get(keycodereal)+3) + ".wav");
            SimpleAudioPlayer player1 = new SimpleAudioPlayer("src/resources/" + ""+((int)map.get(keycodereal)+7) + ".wav");
            player.play();
            player1.play();
            // System.out.println("hellloooo");
            // System.out.println(keycodereal);
            // System.out.println(map.get(keycodereal));
            // System.out.println("src/resources/" + ""+((int)map.get(keycodereal)+3) + ".wav");
        }
        catch (Exception ex) {}}
    }

//     public static void main(String[] args){
//     Harmonize test = new Harmonize(KeyEvent.VK_A);
//     test.Harmonizer();

// }

    
}
