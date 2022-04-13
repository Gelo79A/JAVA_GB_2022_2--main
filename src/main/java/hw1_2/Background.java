package hw1_2;

import java.awt.*;


public class Background extends Sprite {
    private float time;
    private static final float AMPLITUDE = 255f / 2f;
    private Color color;

    @Override
    void update(GameCanvas gameCanvas, float deltaTime) {
        super.update(gameCanvas, deltaTime);
        time += deltaTime;
        int red = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 2f));
        int grin = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time * 3f));
        int blue = Math.round(AMPLITUDE + AMPLITUDE * (float) Math.sin(time));
        color = new Color(red, grin, blue);
    }

    @Override
    void render(GameCanvas gameCanvas, Graphics g) {
        gameCanvas.setBackground(color);
    }
}
