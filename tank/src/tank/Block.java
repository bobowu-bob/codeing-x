package tank;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Block {
	public Block(JFrame frame) { 
		// TODO Auto-generated method stub
		new Map();						//generate a new map
		int[][] arr = Map.sendmap();	//get the map data
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int block_type = arr[i][j];
				switch (block_type) {
				case 0:
					break;
				case 1:
					ImageIcon block_image1 = new ImageIcon("img\\blocks\\Cover.png");
					JLabel block1 = new JLabel(block_image1);
					block1.setSize(48, 48);
					block1.setLocation(48 * i, 48 * j);
					frame.getLayeredPane().add(block1, 0); 
					break;
				case 2:
					ImageIcon block_image2 = new ImageIcon("img\\blocks\\Bricks.png");
					JLabel block2 = new JLabel(block_image2);
					block2.setSize(48, 48);
					block2.setLocation(48 * i, 48 * j);
					frame.getLayeredPane().add(block2, 0); 
					break;
				case 3:
					ImageIcon block_image3 = new ImageIcon("img\\blocks\\Woodenbox.png");
					JLabel block3 = new JLabel(block_image3);
					block3.setSize(48, 48);
					block3.setLocation(48 * i, 48 * j);
					frame.getLayeredPane().add(block3, 0);
					break;
				default:
					break;
//					frame.getLayeredPane().add
				}
			}
		}
	}
}
