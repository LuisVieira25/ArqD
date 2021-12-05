package pt.uma.arq.entities;

import java.util.ArrayList;

public class Board {
    private ArrayList<Block> blocks;

    public Board(){
        this.blocks = new ArrayList<Block>();
    }

    public Board(ArrayList<Block> blocks){
        this.blocks = blocks;
    }

    public ArrayList<Block> getBlocks(){
        return blocks;
    }

    public void addBlock(Block block){
        this.blocks.add(block);
    }
}
