package com.acefkor.zeldabotw.util;

import android.widget.TextView;

public class Util {

    private TextView mat1L1;
    private TextView mat2L1;
    private TextView mat1L2;
    private TextView mat2L2;
    private TextView mat1L3;
    private TextView mat2L3;
    private TextView mat1L4;
    private TextView mat2L4;

    public Util(TextView ... mat1L1){
        this.mat1L1 = mat1L1[0];
        this.mat2L1 = mat1L1[1];
        this.mat1L2 = mat1L1[2];
        this.mat2L2 = mat1L1[3];
        this.mat1L3 = mat1L1[4];
        this.mat2L3 = mat1L1[5];
        this.mat1L4 = mat1L1[6];
        this.mat2L4 = mat1L1[7];
    }

    public void getMaterials(int position){
        if(position == 0){//Soldier\'s Helm
            mat1L1.setText("5x Chuchu Jelly");
            mat2L1.setText("3x Bokoblin Guts");
            mat1L2.setText("3x Keese Eyeball");
            mat2L2.setText("3x Moblin Guts");
            mat1L3.setText("5x Lizalfos Tail");
            mat2L3.setText("2x Hinox Guts");
            mat1L4.setText("4x Lynel Hoof");
            mat2L4.setText("2x Lynel Guts");
        } else if(position >= 1 && position <= 2){//Soldier\'s Armor && Greaves
            mat1L1.setText("5x Chuchu Jelly");
            mat2L1.setText("3x Bokoblin Guts");
            mat1L2.setText("3x Keese Eyeball");
            mat2L2.setText("3x Moblin Guts");
            mat1L3.setText("5x Lizalfos Tail");
            mat2L3.setText("1x Hinox Guts");
            mat1L4.setText("4x Lynel Hoof");
            mat2L4.setText("2x Lynel Guts");
        } else if(position >= 3 && position <= 5){//Stealth set
            mat1L1.setText("3x Blue Nightshade");
            mat2L1.setText("-");
            mat1L2.setText("5x Blue Nightshade");
            mat2L2.setText("5x Sunset Firefly");
            mat1L3.setText("8x Silent Shroom");
            mat2L3.setText("5x Sneaker River Snail");
            mat1L4.setText("10x Stealthfin Fish");
            mat2L4.setText("5x Silent Princess");
        } else if(position >= 6 && position <= 8){//Zora set
            mat1L1.setText("3x Lizalfos Horn");
            mat2L1.setText("-");
            mat1L2.setText("5x Lizalfos Talon");
            mat2L2.setText("5x Hyrule Bass");
            mat1L3.setText("5x Lizalfos Tail");
            mat2L3.setText("5x Hearty Bass");
            mat1L4.setText("10x Lizalfos Tail");
            mat2L4.setText("15x Opal");
        } else if(position >= 9 && position <= 11){//Radiant set
            mat1L1.setText("5x Luminous Stone");
            mat2L1.setText("3x Bokoblin Guts");
            mat1L2.setText("8x Luminous Stone");
            mat2L2.setText("3x Moblin Guts");
            mat1L3.setText("10x Luminous Stone");
            mat2L3.setText("3x Molduga Guts");
            mat1L4.setText("20x Luminous Stone");
            mat2L4.setText("1x Lynel Guts");
        } else if(position >= 12 && position <= 14){//Rubber Set
            mat1L1.setText("3x Yellow Chuchu Jelly");
            mat2L1.setText("-");
            mat1L2.setText("5x Yellow Chuchu Jelly");
            mat2L2.setText("5x Voltfruit");
            mat1L3.setText("5x Zapshroom");
            mat2L3.setText("5x Yellow Lizalfos Tail");
            mat1L4.setText("10x Yellow Lizalfos Tail");
            mat2L4.setText("10x Topaz");
        } else if(position >= 15 && position <= 17){//Snowquill set
            mat1L1.setText("3x Red Chuchu Jelly");
            mat2L1.setText("-");
            mat1L2.setText("5x Red Chuchu Jelly");
            mat2L2.setText("3x Warm Safflina");
            mat1L3.setText("8x Fire Keese Wing");
            mat2L3.setText("5x Sunshroom");
            mat1L4.setText("10x Red Lizalfos Tail");
            mat2L4.setText("5x Ruby");
        } else if(position >= 18 && position <= 20){//Wind Set
            mat1L1.setText("3x Opal");
            mat2L1.setText("1x Star Fragment");
            mat1L2.setText("5x Opal");
            mat2L2.setText("2x Star Fragment");
            mat1L3.setText("10x Opal");
            mat2L3.setText("3x Star Fragment");
            mat1L4.setText("20x Opal");
            mat2L4.setText("4x Star Fragment");
        } else if(position >= 21 && position <= 23){//Hero Set
            mat1L1.setText("1x Ruby");
            mat2L1.setText("1x Star Fragment");
            mat1L2.setText("3x Ruby");
            mat2L2.setText("2x Star Fragment");
            mat1L3.setText("5x Ruby");
            mat2L3.setText("3x Star Fragment");
            mat1L4.setText("10x Ruby");
            mat2L4.setText("4x Star Fragment");
        } else if(position >= 24 && position <= 26){//Hylian Set
            mat1L1.setText("5x Bokoblin Horn");
            mat2L1.setText("-");
            mat1L2.setText("8x Bokoblin Horn");
            mat2L2.setText("5x Bokoblin Fang");
            mat1L3.setText("10x Bokoblin Fang");
            mat2L3.setText("5x Bokoblin Guts");
            mat1L4.setText("15x Bokoblin Guts");
            mat2L4.setText("30x Amber");
        } else if(position >= 27 && position <= 29){//Time Set
            mat1L1.setText("5x Amber");
            mat2L1.setText("1x Star Fragment");
            mat1L2.setText("5x Amber");
            mat2L2.setText("2x Star Fragment");
            mat1L3.setText("15x Amber");
            mat2L3.setText("3x Star Fragment");
            mat1L4.setText("30x Amber");
            mat2L4.setText("4x Star Fragment");
        } else if(position >= 30 && position <= 32){//Twilight Set
            mat1L1.setText("1x Topaz");
            mat2L1.setText("1x Star Fragment");
            mat1L2.setText("3x Topaz");
            mat2L2.setText("2x Star Fragment");
            mat1L3.setText("5x Topaz");
            mat2L3.setText("3x Star Fragment");
            mat1L4.setText("10x Topaz");
            mat2L4.setText("4x Star Fragment");
        } else if(position == 33){//Cap of the Wild
            mat1L1.setText("10x Acorn");
            mat2L1.setText("2x Farosh's Scale");
            mat1L2.setText("5x Courser Bee Honey");
            mat2L2.setText("2x Farosh's Claw");
            mat1L3.setText("5x Energetic Rhino Beetle");
            mat2L3.setText("2x Shard of Farosh's Fang");
            mat1L4.setText("1x Star Fragment");
            mat2L4.setText("2x Shard of Farosh's Horn");
        } else if(position == 34){//Tunic of the Wild
            mat1L1.setText("10x Acorn");
            mat2L1.setText("2x Naydra's Scale");
            mat1L2.setText("5x Coruser Bee Honey");
            mat2L2.setText("2x Naydra's Claw");
            mat1L3.setText("5x Energetic Rhino Beetle");
            mat2L3.setText("2x Shard of Naydra's Fang");
            mat1L4.setText("1x Star Fragment");
            mat2L4.setText("2x Shard of Naydra's Horn");
        } else if(position == 35){//Trousers of the Wild
            mat1L1.setText("10x Acorn");
            mat2L1.setText("2x Dinraal's Scale");
            mat1L2.setText("5x Courser Bee Honey");
            mat1L3.setText("2x Dinraal's Claw");
            mat2L2.setText("5x Energetic Rhino Beetle");
            mat2L3.setText("2x Shard of Dinraal's Fang");
            mat1L4.setText("1x Star Fragment");
            mat2L4.setText("2x Shard of Dinraal's Horn");
        } else if(position >= 36 && position <= 38){//Ancient Set
            mat1L1.setText("5x Ancient Screw");
            mat2L1.setText("5x Ancient Spring");
            mat1L2.setText("15x Ancient Spring");
            mat2L2.setText("10x Ancient Gear");
            mat1L3.setText("15x Ancient Shaft");
            mat2L3.setText("5x Ancient Core");
            mat1L4.setText("1x Star Fragment");
            mat2L4.setText("2x Giant Ancient Core");
        } else if(position >= 39 && position <= 41){//Sky Set
            mat1L1.setText("1x Sapphire");
            mat2L1.setText("1x Star Fragment");
            mat1L2.setText("3x Sapphire");
            mat2L2.setText("2x Star Fragment");
            mat1L3.setText("5x Sapphire");
            mat2L3.setText("3x Star Fragment");
            mat1L4.setText("10x Sapphire");
            mat2L4.setText("4x Star Fragment");
        } else if(position >= 42 && position <= 44){//Desert Voe Set
            mat1L1.setText("3x White Chuchu Jelly");
            mat2L1.setText("-");
            mat1L2.setText("5x White Chuchu Jelly");
            mat2L2.setText("3x Ice Keese Wing");
            mat1L3.setText("8x Ice Keese Wing");
            mat2L3.setText("3x Icy Lizalfos Tail");
            mat1L4.setText("10x Icy Lizalfos Tail");
            mat2L4.setText("5x Sapphire");
        } else if(position == 45){//Fierce Deity Mask
            mat1L1.setText("5x Hinox Toenail");
            mat2L1.setText("1x Dinraal's Scale");
            mat1L2.setText("5x Hinox Tooth");
            mat2L2.setText("1x Dinraal's Claw");
            mat1L3.setText("5x Hinox Guts");
            mat2L3.setText("1x Shard of Dinraal's Fang");
            mat1L4.setText("5x Lynel Guts");
            mat2L4.setText("1x Shard of Dinraal's Horn");
        } else if(position == 46){//Fierce Deity Armor
            mat1L1.setText("5x Hinox Toenail");
            mat2L1.setText("1x Naydra's Scale");
            mat1L2.setText("5x Hinox Tooth");
            mat2L2.setText("1x Naydra's Claw");
            mat1L3.setText("5x Hinox Guts");
            mat2L3.setText("1x Shard of Naydra's Fang");
            mat1L4.setText("5x Lynel Guts");
            mat2L4.setText("1x Shard of Naydra's Horn");
        } else if(position == 47){//Fierce Deity Boots
            mat1L1.setText("5x Hinox Toenail");
            mat2L1.setText("1x Farosh's Scale");
            mat1L2.setText("5x Hinox Tooth");
            mat2L2.setText("1x Farosh's Claw");
            mat1L3.setText("5x Hinox Guts");
            mat2L3.setText("1x Shard of Farosh's Fang");
            mat1L4.setText("5x Lynel Guts");
            mat2L4.setText("1x Shard of Farosh's Horn");
        } else if(position >= 48 && position <= 50){//Flamebreaker Set
            mat1L1.setText("3x Fireproof Lizard");
            mat2L1.setText("3x Moblin Horn");
            mat1L2.setText("5x Fireproof Lizard");
            mat2L2.setText("5x Moblin Fang");
            mat1L3.setText("5x Smotherwing Butterfly");
            mat2L3.setText("3x Moblin Guts");
            mat1L4.setText("8x Smotherwing Butterfly");
            mat2L4.setText("5x Hinox Guts");
        } else if(position == 51){//Barbarian Helm
            mat1L1.setText("3x Lynel Horn");
            mat2L1.setText("-");
            mat1L2.setText("5x Lynel Horn");
            mat2L2.setText("3x Lynel Hoof");
            mat1L3.setText("8x Lynel Hoof");
            mat2L3.setText("1x Lynel Guts");
            mat1L4.setText("2x Lynel Guts");
            mat2L4.setText("1x Shard of Dinraal's Horn");
        } else if(position == 52){//Barbarian Armor
            mat1L1.setText("3x Lynel Horn");
            mat2L1.setText("-");
            mat1L2.setText("5x Lynel Horn");
            mat2L2.setText("3x Lynel Hoof");
            mat1L3.setText("8x Lynel Hoof");
            mat2L3.setText("1x Lynel Guts");
            mat1L4.setText("2x Lynel Guts");
            mat2L4.setText("1x Shard of Farosh's Horn");
        } else if(position == 53){//Barbarian Leg Wraps
            mat1L1.setText("3x Lynel Horn");
            mat2L1.setText("-");
            mat1L2.setText("5x Lynel Horn");
            mat2L2.setText("3x Lynel Hoof");
            mat1L3.setText("8x Lynel Hoof");
            mat2L3.setText("1x Lynel Guts");
            mat1L4.setText("2x Lynel Guts");
            mat2L4.setText("1x Shard of Naydra's Horn");
        } else if(position >= 54 && position <= 56){//Climbing Set
            mat1L1.setText("3x Keese Wing");
            mat2L1.setText("3x Rushroom");
            mat1L2.setText("5x Electric Keese Wing");
            mat2L2.setText("5x Hightail Lizard");
            mat1L3.setText("5x Ice Keese Wing");
            mat2L3.setText("10x Hot-Footed Frog");
            mat1L4.setText("5x Fire Keese Wing");
            mat2L4.setText("20x Swift Violet");
        } else if(position == 57){//Amber Earrings
            mat1L1.setText("3x Amber");
            mat2L1.setText("3x Flint");
            mat1L2.setText("10x Amber");
            mat2L2.setText("3x Flint");
            mat1L3.setText("20x Amber");
            mat2L3.setText("3x Flint");
            mat1L4.setText("30x Amber");
            mat2L4.setText("3x Flint");
        } else if(position == 58){//Topaz Earrings
            mat1L1.setText("2x Topaz");
            mat2L1.setText("3x Flint");
            mat1L2.setText("4x Topaz");
            mat2L2.setText("3x Flint");
            mat1L3.setText("6x Topaz");
            mat2L3.setText("3x Flint");
            mat1L4.setText("10x Topaz");
            mat2L4.setText("3x Flint");
        } else if(position == 59){//Opal Earrings
            mat1L1.setText("3x Opal");
            mat2L1.setText("3x Flint");
            mat1L2.setText("8x Opal");
            mat2L2.setText("3x Flint");
            mat1L3.setText("16x Opal");
            mat2L3.setText("3x Flint");
            mat1L4.setText("20x Opal");
            mat2L4.setText("3x Flint");
        } else if(position == 60){//Diamond Circlet
            mat1L1.setText("2x Diamond");
            mat2L1.setText("3x Flint");
            mat1L2.setText("4x Diamond");
            mat2L2.setText("3x Flint");
            mat1L3.setText("6x Diamond");
            mat2L3.setText("3x Flint");
            mat1L4.setText("10x Diamond");
            mat2L4.setText("3x Flint");
        } else if(position == 61){//Ruby Circlet
            mat1L1.setText("2x Ruby");
            mat2L1.setText("3x Flint");
            mat1L2.setText("4x Ruby");
            mat2L2.setText("3x Flint");
            mat1L3.setText("6x Ruby");
            mat2L3.setText("3x Flint");
            mat1L4.setText("10x Ruby");
            mat2L4.setText("3x Flint");
        } else if(position == 62){//Sapphire Circlet
            mat1L1.setText("2x Sapphire");
            mat2L1.setText("3x Flint");
            mat1L2.setText("4x Sapphire");
            mat2L2.setText("3x Flint");
            mat1L3.setText("6x Sapphire");
            mat2L3.setText("3x Flint");
            mat1L4.setText("10x Sapphire");
            mat2L4.setText("3x Flint");
        } else if(position == 63){//Sheik's Mask
            mat1L1.setText("1x Silent Princess");
            mat2L1.setText("1x Star Fragment");
            mat1L2.setText("2x Silent Princess");
            mat2L2.setText("2x Star Fragment");
            mat1L3.setText("3x Silent Princess");
            mat2L3.setText("3x Star Fragment");
            mat1L4.setText("4x Silent Princess");
            mat2L4.setText("4x Star Fragment");
        } else if(position == 64){//Champion's Tunic
            mat1L1.setText("3x Silent Princess");
            mat2L1.setText("-");
            mat1L2.setText("3x Silent Princess");
            mat2L2.setText("2x Shard of Farosh's Horn");
            mat1L3.setText("3x Silent Princess");
            mat2L3.setText("2x Shard of Naydra's Horn");
            mat1L4.setText("3x Silent Princess");
            mat2L4.setText("2x Shard of Dinraal's Horn");
        } else if(position == 65){//Sand Boots
            mat1L1.setText("5x Molduga Fin");
            mat2L1.setText("10x Hightail Lizard");
            mat1L2.setText("10x Molduga Fin");
            mat2L2.setText("10x Swift Carrot");
            mat1L3.setText("3x Molduga Guts");
            mat2L3.setText("15x Rushroom");
            mat1L4.setText("5x Molduga Guts");
            mat2L4.setText("15x Swift Violet");
        } else if(position == 66){//Snow Boots
            mat1L1.setText("5x Octorok Tentacle");
            mat2L1.setText("10x Hightail Lizard");
            mat1L2.setText("5x Octo Balloon");
            mat2L2.setText("10x Swift Carrot");
            mat1L3.setText("5x Octorok Eyeball");
            mat2L3.setText("15x Rushroom");
            mat1L4.setText("2x Naydra's Scale");
            mat2L4.setText("15x Swift Violet");
        }
    }

}
