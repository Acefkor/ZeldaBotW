package com.acefkor.zeldabotw.util;

import android.widget.TextView;

public class MaterialUtil {

    private TextView mat1L1;
    private TextView mat2L1;
    private TextView mat1L2;
    private TextView mat2L2;
    private TextView mat1L3;
    private TextView mat2L3;
    private TextView mat1L4;
    private TextView mat2L4;
    private TextView descrip;

    public MaterialUtil(TextView... mat1L1) {
        this.mat1L1 = mat1L1[0];
        this.mat2L1 = mat1L1[1];
        this.mat1L2 = mat1L1[2];
        this.mat2L2 = mat1L1[3];
        this.mat1L3 = mat1L1[4];
        this.mat2L3 = mat1L1[5];
        this.mat1L4 = mat1L1[6];
        this.mat2L4 = mat1L1[7];
        this.descrip = mat1L1[8];
    }

    public void getMaterials(int position) {
        switch (position){
            case 0://Amber Earrings
                mat1L1.setText("3x Amber");
                mat2L1.setText("3x Flint");
                mat1L2.setText("10x Amber");
                mat2L2.setText("3x Flint");
                mat1L3.setText("20x Amber");
                mat2L3.setText("3x Flint");
                mat1L4.setText("30x Amber");
                mat2L4.setText("3x Flint");
                descrip.setText("One of the items sold by the Gerudo jeweler. " +
                        "These earrings are made with amber, a gem that harnesses the power of the land to increase defense when equipped.");
                break;
            case 1://Ancient Cuirass
                mat1L1.setText("5x Ancient Screw");
                mat2L1.setText("5x Ancient Spring");
                mat1L2.setText("15x Ancient Spring");
                mat2L2.setText("10x Ancient Gear");
                mat1L3.setText("15x Ancient Shaft");
                mat2L3.setText("5x Ancient Core");
                mat1L4.setText("1x Star Fragment");
                mat2L4.setText("2x Giant Ancient Core");
                descrip.setText("This armor was created by ancient Sheikah technology using Guardian " +
                        "parts. Equipping it will reduce the damage you take from ancient weaponry.");
                break;
            case 2://Ancient Greaves
                mat1L1.setText("5x Ancient Screw");
                mat2L1.setText("5x Ancient Spring");
                mat1L2.setText("15x Ancient Spring");
                mat2L2.setText("10x Ancient Gear");
                mat1L3.setText("15x Ancient Shaft");
                mat2L3.setText("5x Ancient Core");
                mat1L4.setText("1x Star Fragment");
                mat2L4.setText("2x Giant Ancient Core");
                descrip.setText("Robbie engineered these greaves at the research institute using the " +
                        "same technology found in Guardian automata. They reduce damage from ancient weaponry.");
                break;
            case 3://Ancient Helm
                mat1L1.setText("5x Ancient Screw");
                mat2L1.setText("5x Ancient Spring");
                mat1L2.setText("15x Ancient Spring");
                mat2L2.setText("10x Ancient Gear");
                mat1L3.setText("15x Ancient Shaft");
                mat2L3.setText("5x Ancient Core");
                mat1L4.setText("1x Star Fragment");
                mat2L4.setText("2x Giant Ancient Core");
                descrip.setText("This headgear is the result of Robbie's research. It uses Guardian " +
                        "parts to decrease damage from ancient energy attacks.");
                break;
            case 4://Barbarian Armor
                mat1L1.setText("3x Lynel Horn");
                mat2L1.setText("-");
                mat1L2.setText("5x Lynel Horn");
                mat2L2.setText("3x Lynel Hoof");
                mat1L3.setText("8x Lynel Hoof");
                mat2L3.setText("1x Lynel Guts");
                mat1L4.setText("2x Lynel Guts");
                mat2L4.setText("1x Shard of Farosh's Horn");
                descrip.setText("Armor once favored by an ancient warlike tribe from the Faron " +
                        "region. The war paint bolsters your fighting spirit and raises your attack power.");
                break;
            case 5://Barbarian Helm
                mat1L1.setText("3x Lynel Horn");
                mat2L1.setText("-");
                mat1L2.setText("5x Lynel Horn");
                mat2L2.setText("3x Lynel Hoof");
                mat1L3.setText("8x Lynel Hoof");
                mat2L3.setText("1x Lynel Guts");
                mat1L4.setText("2x Lynel Guts");
                mat2L4.setText("1x Shard of Dinraal's Horn");
                descrip.setText("A helmet once worn by the warriors of an ancient warlike tribe from " +
                        "the Faron region. Wearing it draws out your inner animal, increasing your strength and battle prowess.");
                break;
            case 6://Barbarian Legs Wraps
                mat1L1.setText("3x Lynel Horn");
                mat2L1.setText("-");
                mat1L2.setText("5x Lynel Horn");
                mat2L2.setText("3x Lynel Hoof");
                mat1L3.setText("8x Lynel Hoof");
                mat2L3.setText("1x Lynel Guts");
                mat1L4.setText("2x Lynel Guts");
                mat2L4.setText("1x Shard of Naydra's Horn");
                descrip.setText("These leg wraps were favored by a warlike tribe from the Faron " +
                        "region long ago. They're adorned with traditional markings that bolster your fighting spirit to raise your attack power.");
                break;
            case 7://Cap of the Hero
                mat1L1.setText("1x Ruby");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("3x Ruby");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("5x Ruby");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("10x Ruby");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("According to legend, this cap was once treasured by an ancient hero. " +
                        "It's quite the simple cap, yet there's something about it that's just so appealing...");
                break;
            case 8://Cap of the Sky
                mat1L1.setText("1x Sapphire");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("3x Sapphire");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("5x Sapphire");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("10x Sapphire");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("According to legend, this cap was once worn by a hero who appeared " +
                        "from the sky riding a mighty bird. Perfect for those who long to take to the skies.");
                break;
            case 9:// Cap of the Wild
                mat1L1.setText("10x Acorn");
                mat2L1.setText("2x Farosh's Scale");
                mat1L2.setText("5x Courser Bee Honey");
                mat2L2.setText("2x Farosh's Claw");
                mat1L3.setText("5x Energetic Rhino Beetle");
                mat2L3.setText("2x Shard of Farosh's Fang");
                mat1L4.setText("1x Star Fragment");
                mat2L4.setText("2x Shard of Farosh's Horn");
                descrip.setText("According to legend, this cap was crafted for a hero who travels the wild lands. Wearing it just feels so right.");
                break;
            case 10://Cap of the Wind
                mat1L1.setText("3x Opal");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("5x Opal");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("10x Opal");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("20x Opal");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("According to legend, this cap was treasured by a hero who traveled " +
                        "the Great Sea. It flaps quite serenely in a soft sea breeze.");
                break;
            case 11:// Cap of Time
                mat1L1.setText("5x Amber");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("5x Amber");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("15x Amber");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("30x Amber");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("According to legend, this cap was once worn by a hero who traveled " +
                        "through time. A truly timeless item perfect for kids and adults alike!");
                break;
            case 12:// Cap of Twilight
                mat1L1.setText("1x Topaz");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("3x Topaz");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("5x Topaz");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("10x Topaz");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("According to legend, this cap was once worn by a hero who battled " +
                        "the monsters of twilight. For one reason or another, it seems to smell of some beast...");
                break;
            case 13://Champion's Tunic
                mat1L1.setText("3x Silent Princess");
                mat2L1.setText("-");
                mat1L2.setText("3x Silent Princess");
                mat2L2.setText("2x Shard of Farosh's Horn");
                mat1L3.setText("3x Silent Princess");
                mat2L3.setText("2x Shard of Naydra's Horn");
                mat1L4.setText("3x Silent Princess");
                mat2L4.setText("2x Shard of Dinraal's Horn");
                descrip.setText("In ancient Hyrule, this garment could only be worn by one who had " +
                        "earned the respect of the royal family. Equipping it will reveal an enemy's life gauge.");
                break;
            case 14://Climber' Bandanna
                mat1L1.setText("3x Keese Wing");
                mat2L1.setText("3x Rushroom");
                mat1L2.setText("5x Electric Keese Wing");
                mat2L2.setText("5x Hightail Lizard");
                mat1L3.setText("5x Ice Keese Wing");
                mat2L3.setText("10x Hot-Footed Frog");
                mat1L4.setText("5x Fire Keese Wing");
                mat2L4.setText("20x Swift Violet");
                descrip.setText(" \tIt may look like a regular bandanna, but it's actually infused " +
                        "with ancient technology that enhances core strength to improve your climbing ability.");
                break;
            case 15://Climbing Boots
                mat1L1.setText("3x Keese Wing");
                mat2L1.setText("3x Rushroom");
                mat1L2.setText("5x Electric Keese Wing");
                mat2L2.setText("5x Hightail Lizard");
                mat1L3.setText("5x Ice Keese Wing");
                mat2L3.setText("10x Hot-Footed Frog");
                mat1L4.setText("5x Fire Keese Wing");
                mat2L4.setText("20x Swift Violet");
                descrip.setText("These rock-climbing boots have special no-slip toes that help you " +
                        "cling to walls. This ancient technology facilitates more nimble climbing.");
                break;
            case 16://Climbing Gear
                mat1L1.setText("3x Keese Wing");
                mat2L1.setText("3x Rushroom");
                mat1L2.setText("5x Electric Keese Wing");
                mat2L2.setText("5x Hightail Lizard");
                mat1L3.setText("5x Ice Keese Wing");
                mat2L3.setText("10x Hot-Footed Frog");
                mat1L4.setText("5x Fire Keese Wing");
                mat2L4.setText("20x Swift Violet");
                descrip.setText("The ancient technology in this gear will make you a better climber. " +
                        "The special no-slip gloves help you use your energy more efficiently to facilitate nimble climbing.");
                break;
            case 17://Desert Voe Headband
                mat1L1.setText("3x White Chuchu Jelly");
                mat2L1.setText("-");
                mat1L2.setText("5x White Chuchu Jelly");
                mat2L2.setText("3x Ice Keese Wing");
                mat1L3.setText("8x Ice Keese Wing");
                mat2L3.setText("3x Icy Lizalfos Tail");
                mat1L4.setText("10x Icy Lizalfos Tail");
                mat2L4.setText("5x Sapphire");
                descrip.setText("Gerudo armor for males. Contains sapphire, which harnesses the " +
                        "power of ice to make the heat more bearable.");
                break;
            case 18://Desert Voe Spaulder
                mat1L1.setText("3x White Chuchu Jelly");
                mat2L1.setText("-");
                mat1L2.setText("5x White Chuchu Jelly");
                mat2L2.setText("3x Ice Keese Wing");
                mat1L3.setText("8x Ice Keese Wing");
                mat2L3.setText("3x Icy Lizalfos Tail");
                mat1L4.setText("10x Icy Lizalfos Tail");
                mat2L4.setText("5x Sapphire");
                descrip.setText("Armor for males sold rarely by Gerudo retailers. It contains " +
                        "sapphire, which harnesses the power of ice to make hot climates more tolerable.");
                break;
            case 19://Desert Voe Trousers
                mat1L1.setText("3x White Chuchu Jelly");
                mat2L1.setText("-");
                mat1L2.setText("5x White Chuchu Jelly");
                mat2L2.setText("3x Ice Keese Wing");
                mat1L3.setText("8x Ice Keese Wing");
                mat2L3.setText("3x Icy Lizalfos Tail");
                mat1L4.setText("10x Icy Lizalfos Tail");
                mat2L4.setText("5x Sapphire");
                descrip.setText("Gerudo-made trousers for men sold rarely by Gerudo retailers. " +
                        "Sapphire is used in their creation, which harnesses the power of ice to make the heat more tolerable.");
                break;
            case 20://Diamond Circlet
                mat1L1.setText("2x Diamond");
                mat2L1.setText("3x Flint");
                mat1L2.setText("4x Diamond");
                mat2L2.setText("3x Flint");
                mat1L3.setText("6x Diamond");
                mat2L3.setText("3x Flint");
                mat1L4.setText("10x Diamond");
                mat2L4.setText("3x Flint");
                descrip.setText("A luxurious headpiece sold at Gerudo jewelry shops. It's decorated " +
                        "with a diamond, which harnesses the power of light to reduce damage received from ancient enemies.");
                break;
            case 21://Fierce Deity Armor
                mat1L1.setText("5x Hinox Toenail");
                mat2L1.setText("1x Naydra's Scale");
                mat1L2.setText("5x Hinox Tooth");
                mat2L2.setText("1x Naydra's Claw");
                mat1L3.setText("5x Hinox Guts");
                mat2L3.setText("1x Shard of Naydra's Fang");
                mat1L4.setText("5x Lynel Guts");
                mat2L4.setText("1x Shard of Naydra's Horn");
                descrip.setText("Legend has it this armor once belonged to the hero of a world in " +
                        "which the moon threatened to fall. When you wear it, you feel a fierce, godlike power flow through you.");
                break;
            case 22://Fierce Deity Boots
                mat1L1.setText("5x Hinox Toenail");
                mat2L1.setText("1x Farosh's Scale");
                mat1L2.setText("5x Hinox Tooth");
                mat2L2.setText("1x Farosh's Claw");
                mat1L3.setText("5x Hinox Guts");
                mat2L3.setText("1x Shard of Farosh's Fang");
                mat1L4.setText("5x Lynel Guts");
                mat2L4.setText("1x Shard of Farosh's Horn");
                descrip.setText("According to legend, these boots were once worn by a hero from a " +
                        "world in which the moon threatened to fall. Wearing them provides godlike power.");
                break;
            case 23://Fierce Deity Mask
                mat1L1.setText("5x Hinox Toenail");
                mat2L1.setText("1x Dinraal's Scale");
                mat1L2.setText("5x Hinox Tooth");
                mat2L2.setText("1x Dinraal's Claw");
                mat1L3.setText("5x Hinox Guts");
                mat2L3.setText("1x Shard of Dinraal's Fang");
                mat1L4.setText("5x Lynel Guts");
                mat2L4.setText("1x Shard of Dinraal's Horn");
                descrip.setText("Legends say this mask was once worn by a hero from a world in which " +
                        "the moon threatened to fall. It looks scary, but wearing it offers fierce, godlike power.");
                break;
            case 24://Flamebreaker Armor
                mat1L1.setText("3x Fireproof Lizard");
                mat2L1.setText("3x Moblin Horn");
                mat1L2.setText("5x Fireproof Lizard");
                mat2L2.setText("5x Moblin Fang");
                mat1L3.setText("5x Smotherwing Butterfly");
                mat2L3.setText("3x Moblin Guts");
                mat1L4.setText("8x Smotherwing Butterfly");
                mat2L4.setText("5x Hinox Guts");
                descrip.setText("Armor crafted by Gorons for Hylians curious enough to visit Goron " +
                        "City. It's made from fire-resistant rocks to protect the wearer.");
                break;
            case 25://Flamebreaker Boots
                mat1L1.setText("3x Fireproof Lizard");
                mat2L1.setText("3x Moblin Horn");
                mat1L2.setText("5x Fireproof Lizard");
                mat2L2.setText("5x Moblin Fang");
                mat1L3.setText("5x Smotherwing Butterfly");
                mat2L3.setText("3x Moblin Guts");
                mat1L4.setText("8x Smotherwing Butterfly");
                mat2L4.setText("5x Hinox Guts");
                descrip.setText("Goron artisans used flame-resistant rocks to craft these fireproof " +
                        "boots for curious Hylians visiting Goron City.");
                break;
            case 26://Flamebreaker Helm
                mat1L1.setText("3x Fireproof Lizard");
                mat2L1.setText("3x Moblin Horn");
                mat1L2.setText("5x Fireproof Lizard");
                mat2L2.setText("5x Moblin Fang");
                mat1L3.setText("5x Smotherwing Butterfly");
                mat2L3.setText("3x Moblin Guts");
                mat1L4.setText("8x Smotherwing Butterfly");
                mat2L4.setText("5x Hinox Guts");
                descrip.setText("Stone headgear made by Goron craftsmen to protect tourists visiting " +
                        "Goron City. As if its flame resistance isn't enough of a selling point, it also covers your entire head!");
                break;
            case 27://Hylian Hood
                mat1L1.setText("5x Bokoblin Horn");
                mat2L1.setText("-");
                mat1L2.setText("8x Bokoblin Horn");
                mat2L2.setText("5x Bokoblin Fang");
                mat1L3.setText("10x Bokoblin Fang");
                mat2L3.setText("5x Bokoblin Guts");
                mat1L4.setText("15x Bokoblin Guts");
                mat2L4.setText("30x Amber");
                descrip.setText("A hood woven using traditional Hyrulean methods. It's made from a " +
                        "sturdy material to protect travelers from the harsh sun and weather.");
                break;
            case 28://Hylian Trousers
                mat1L1.setText("5x Bokoblin Horn");
                mat2L1.setText("-");
                mat1L2.setText("8x Bokoblin Horn");
                mat2L2.setText("5x Bokoblin Fang");
                mat1L3.setText("10x Bokoblin Fang");
                mat2L3.setText("5x Bokoblin Guts");
                mat1L4.setText("15x Bokoblin Guts");
                mat2L4.setText("30x Amber");
                descrip.setText("Traditional dress trousers of Hyrule. The plush fabric makes these " +
                        "trousers quite comfortable, and their high durability makes them ideal for travelers.");
                break;
            case 29://Hylian Tunic
                mat1L1.setText("5x Bokoblin Horn");
                mat2L1.setText("-");
                mat1L2.setText("8x Bokoblin Horn");
                mat2L2.setText("5x Bokoblin Fang");
                mat1L3.setText("10x Bokoblin Fang");
                mat2L3.setText("5x Bokoblin Guts");
                mat1L4.setText("15x Bokoblin Guts");
                mat2L4.setText("30x Amber");
                descrip.setText("A common garb that achieved widespread popularity in Hyrule, " +
                        "particularly among travelers. Its light-yet-sturdy fabric doesn't limit movement.");
                break;
            case 30://Opal Earrings
                mat1L1.setText("3x Opal");
                mat2L1.setText("3x Flint");
                mat1L2.setText("8x Opal");
                mat2L2.setText("3x Flint");
                mat1L3.setText("16x Opal");
                mat2L3.setText("3x Flint");
                mat1L4.setText("20x Opal");
                mat2L4.setText("3x Flint");
                descrip.setText("Earrings sold at Gerudo jewelry shops. They contain opal, a gem " +
                        "that harnesses the power of water to increase your swimming speed.");
                break;
            case 31://Radiant Mask
                mat1L1.setText("5x Luminous Stone");
                mat2L1.setText("3x Bokoblin Guts");
                mat1L2.setText("8x Luminous Stone");
                mat2L2.setText("3x Moblin Guts");
                mat1L3.setText("10x Luminous Stone");
                mat2L3.setText("3x Molduga Guts");
                mat1L4.setText("20x Luminous Stone");
                mat2L4.setText("1x Lynel Guts");
                descrip.setText("A special mask for members of the Gerudo Secret Club. Painted with " +
                        "dye made from crushed luminous stones, it gives off a lurid, mysterious glow in the dark.");
                break;
            case 32://Radiant Shirt
                mat1L1.setText("5x Luminous Stone");
                mat2L1.setText("3x Bokoblin Guts");
                mat1L2.setText("8x Luminous Stone");
                mat2L2.setText("3x Moblin Guts");
                mat1L3.setText("10x Luminous Stone");
                mat2L3.setText("3x Molduga Guts");
                mat1L4.setText("20x Luminous Stone");
                mat2L4.setText("1x Lynel Guts");
                descrip.setText("This shirt is sold at the Gerudo Secret Club. It glows with a " +
                        "strange pattern in the dark due to a dye made from crushed luminous stones.");
                break;
            case 33://Radiant Tights
                mat1L1.setText("5x Luminous Stone");
                mat2L1.setText("3x Bokoblin Guts");
                mat1L2.setText("8x Luminous Stone");
                mat2L2.setText("3x Moblin Guts");
                mat1L3.setText("10x Luminous Stone");
                mat2L3.setText("3x Molduga Guts");
                mat1L4.setText("20x Luminous Stone");
                mat2L4.setText("1x Lynel Guts");
                descrip.setText("These tights are sold in the Gerudo Secret Club. They're painted " +
                        "with dye from crushed luminous stones, which gives them an eerie glow in the dark.");
                break;
            case 34://Rubber Armor
                mat1L1.setText("3x Yellow Chuchu Jelly");
                mat2L1.setText("-");
                mat1L2.setText("5x Yellow Chuchu Jelly");
                mat2L2.setText("5x Voltfruit");
                mat1L3.setText("5x Zapshroom");
                mat2L3.setText("5x Yellow Lizalfos Tail");
                mat1L4.setText("10x Yellow Lizalfos Tail");
                mat2L4.setText("10x Topaz");
                descrip.setText("This armor has built-in electricity resistance thanks to its source " +
                        "material—an ancient marvel called \"rubber.\" Such technology does not exist in this modern age.");
                break;
            case 35://Rubber Helm
                mat1L1.setText("3x Yellow Chuchu Jelly");
                mat2L1.setText("-");
                mat1L2.setText("5x Yellow Chuchu Jelly");
                mat2L2.setText("5x Voltfruit");
                mat1L3.setText("5x Zapshroom");
                mat2L3.setText("5x Yellow Lizalfos Tail");
                mat1L4.setText("10x Yellow Lizalfos Tail");
                mat2L4.setText("10x Topaz");
                descrip.setText("A helmet made from ancient techniques and electricity-resistant " +
                        "material. It's made from something called \"rubber,\" a material that can no longer be found.");
                break;
            case 36://Rubber Tights
                mat1L1.setText("3x Yellow Chuchu Jelly");
                mat2L1.setText("-");
                mat1L2.setText("5x Yellow Chuchu Jelly");
                mat2L2.setText("5x Voltfruit");
                mat1L3.setText("5x Zapshroom");
                mat2L3.setText("5x Yellow Lizalfos Tail");
                mat1L4.setText("10x Yellow Lizalfos Tail");
                mat2L4.setText("10x Topaz");
                descrip.setText("These invaluable tights are resistant to electricity. They're made " +
                        "with something called \"rubber,\" an ancient technology that no longer exists in this modern age.");
                break;
            case 37://Ruby Circlet
                mat1L1.setText("2x Ruby");
                mat2L1.setText("3x Flint");
                mat1L2.setText("4x Ruby");
                mat2L2.setText("3x Flint");
                mat1L3.setText("6x Ruby");
                mat2L3.setText("3x Flint");
                mat1L4.setText("10x Ruby");
                mat2L4.setText("3x Flint");
                descrip.setText("A headpiece made by Gerudo craft workers. It's set with a ruby, a " +
                        "gem that harnesses the power of fire to make cold climates more bearable.");
                break;
            case 38://Sand Boots
                mat1L1.setText("5x Molduga Fin");
                mat2L1.setText("10x Hightail Lizard");
                mat1L2.setText("10x Molduga Fin");
                mat2L2.setText("10x Swift Carrot");
                mat1L3.setText("3x Molduga Guts");
                mat2L3.setText("15x Rushroom");
                mat1L4.setText("5x Molduga Guts");
                mat2L4.setText("15x Swift Violet");
                descrip.setText("Gerudo artisans modified these boots for life in the desert. The " +
                        "special soles distribute your body weight evenly so you can maintain your normal movement speed on sand.");
                break;
            case 39://Sapphire Circlet
                mat1L1.setText("2x Sapphire");
                mat2L1.setText("3x Flint");
                mat1L2.setText("4x Sapphire");
                mat2L2.setText("3x Flint");
                mat1L3.setText("6x Sapphire");
                mat2L3.setText("3x Flint");
                mat1L4.setText("10x Sapphire");
                mat2L4.setText("3x Flint");
                descrip.setText("An intricate headpiece crafted with Gerudo goldsmith techniques. " +
                        "It's set with a sapphire, a gem that harnesses the power of ice to make hot climates more tolerable.");
                break;
            case 40://Sheik's Mask
                mat1L1.setText("1x Silent Princess");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("2x Silent Princess");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("3x Silent Princess");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("4x Silent Princess");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("A mask said to have been worn by a Sheikah who saved a time-traveling " +
                        "hero. Made from the finest of Sheikah stealth fabrics, it is the final word in undercover gear.");
                break;
            case 41://Snow Boots
                mat1L1.setText("5x Octorok Tentacle");
                mat2L1.setText("10x Hightail Lizard");
                mat1L2.setText("5x Octo Balloon");
                mat2L2.setText("10x Swift Carrot");
                mat1L3.setText("5x Octorok Eyeball");
                mat2L3.setText("15x Rushroom");
                mat1L4.setText("2x Naydra's Scale");
                mat2L4.setText("15x Swift Violet");
                descrip.setText("Bozai was kind enough to lend you these boots. They evenly " +
                        "distribute your body weight so you can maintain your normal walking speed over deep snow.");
                break;
            case 42://Snowquill Headdress
                mat1L1.setText("3x Red Chuchu Jelly");
                mat2L1.setText("-");
                mat1L2.setText("5x Red Chuchu Jelly");
                mat2L2.setText("3x Warm Safflina");
                mat1L3.setText("8x Fire Keese Wing");
                mat2L3.setText("5x Sunshroom");
                mat1L4.setText("10x Red Lizalfos Tail");
                mat2L4.setText("5x Ruby");
                descrip.setText("A Rito accessory made from snow-bird feathers. It's adorned with a " +
                        "ruby, a gem that harnesses the power of fire to make cold climates more tolerable.");
                break;
            case 43://Snowquill Trousers
                mat1L1.setText("3x Red Chuchu Jelly");
                mat2L1.setText("-");
                mat1L2.setText("5x Red Chuchu Jelly");
                mat2L2.setText("3x Warm Safflina");
                mat1L3.setText("8x Fire Keese Wing");
                mat2L3.setText("5x Sunshroom");
                mat1L4.setText("10x Red Lizalfos Tail");
                mat2L4.setText("5x Ruby");
                descrip.setText("The Rito sell these trousers to Hylians in Rito Village. The inside " +
                        "is lined with Rito feathers, so they excel at retaining body heat.");
                break;
            case 44://Snowquill Tunic
                mat1L1.setText("3x Red Chuchu Jelly");
                mat2L1.setText("-");
                mat1L2.setText("5x Red Chuchu Jelly");
                mat2L2.setText("3x Warm Safflina");
                mat1L3.setText("8x Fire Keese Wing");
                mat2L3.setText("5x Sunshroom");
                mat1L4.setText("10x Red Lizalfos Tail");
                mat2L4.setText("5x Ruby");
                descrip.setText("Lined with molted Rito feathers, this tunic was made by Rito " +
                        "artisans for Hylians visiting cold climates. The feathers are stacked in each layer to retain body heat.");
                break;
            case 45://Soldier's Armor
                mat1L1.setText("5x Chuchu Jelly");
                mat2L1.setText("3x Bokoblin Guts");
                mat1L2.setText("3x Keese Eyeball");
                mat2L2.setText("3x Moblin Guts");
                mat1L3.setText("5x Lizalfos Tail");
                mat2L3.setText("1x Hinox Guts");
                mat1L4.setText("4x Lynel Hoof");
                mat2L4.setText("2x Lynel Guts");
                descrip.setText("Hyrulean guards praised this armor for its superior defense. Made " +
                        "from sturdy plates of metal, the high level of craftsmanship that went into it is obvious with just a glance.");
                break;
            case 46://Soldier's Greaves
                mat1L1.setText("5x Chuchu Jelly");
                mat2L1.setText("3x Bokoblin Guts");
                mat1L2.setText("3x Keese Eyeball");
                mat2L2.setText("3x Moblin Guts");
                mat1L3.setText("5x Lizalfos Tail");
                mat2L3.setText("1x Hinox Guts");
                mat1L4.setText("4x Lynel Hoof");
                mat2L4.setText("2x Lynel Guts");
                descrip.setText("Hyrulean guards favored these greaves. They owe their distinctly " +
                        "high defense to the metal plates they're made from, but the added weight takes some getting used to.");
                break;
            case 47://Soldier's Helm
                mat1L1.setText("5x Chuchu Jelly");
                mat2L1.setText("3x Bokoblin Guts");
                mat1L2.setText("3x Keese Eyeball");
                mat2L2.setText("3x Moblin Guts");
                mat1L3.setText("5x Lizalfos Tail");
                mat2L3.setText("2x Hinox Guts");
                mat1L4.setText("4x Lynel Hoof");
                mat2L4.setText("2x Lynel Guts");
                descrip.setText("Headgear made from sturdy metals for frontline soldiers. Praised " +
                        "for their defensive capabilities, the only helms that remain are those that survived the Calamity.");
                break;
            case 48://Stealth Chest Guard
                mat1L1.setText("3x Blue Nightshade");
                mat2L1.setText("-");
                mat1L2.setText("5x Blue Nightshade");
                mat2L2.setText("5x Sunset Firefly");
                mat1L3.setText("8x Silent Shroom");
                mat2L3.setText("5x Sneaker River Snail");
                mat1L4.setText("10x Stealthfin Fish");
                mat2L4.setText("5x Silent Princess");
                descrip.setText("Armor designed for stealth, passed down through the Sheikah tribe. " +
                        "The special fabrics suppress the rustling of clothes even when moving quickly.");
                break;
            case 49://Stealth Mask
                mat1L1.setText("3x Blue Nightshade");
                mat2L1.setText("-");
                mat1L2.setText("5x Blue Nightshade");
                mat2L2.setText("5x Sunset Firefly");
                mat1L3.setText("8x Silent Shroom");
                mat2L3.setText("5x Sneaker River Snail");
                mat1L4.setText("10x Stealthfin Fish");
                mat2L4.setText("5x Silent Princess");
                descrip.setText("It may look like a regular cloth mask, but it was made using " +
                        "Sheikah crafting techniques to suppress the noisy rustling of clothes. Perfect for sneaking about.");
                break;
            case 50://Stealth Tights
                mat1L1.setText("3x Blue Nightshade");
                mat2L1.setText("-");
                mat1L2.setText("5x Blue Nightshade");
                mat2L2.setText("5x Sunset Firefly");
                mat1L3.setText("8x Silent Shroom");
                mat2L3.setText("5x Sneaker River Snail");
                mat1L4.setText("10x Stealthfin Fish");
                mat2L4.setText("5x Silent Princess");
                descrip.setText("Members of the Sheikah tribe wear these tights when they need to " +
                        "move stealthily. They're made from noise-suppressing cloth, a hallmark of ancient Sheikah technology.");
                break;
            case 51://Topaz Earrings
                mat1L1.setText("2x Topaz");
                mat2L1.setText("3x Flint");
                mat1L2.setText("4x Topaz");
                mat2L2.setText("3x Flint");
                mat1L3.setText("6x Topaz");
                mat2L3.setText("3x Flint");
                mat1L4.setText("10x Topaz");
                mat2L4.setText("3x Flint");
                descrip.setText("Earrings made by Gerudo craft workers. They're made with topaz, a " +
                        "gem that harnesses the power of lightning to increase electricity resistance.");
                break;
            case 52://Trousers of the Hero
                mat1L1.setText("1x Ruby");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("3x Ruby");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("5x Ruby");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("10x Ruby");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("Legends say these trousers were favored by a hero from an " +
                        "ancient age. Their simple design is a rare aesthetic these days, but there's something classic about them.");
                break;
            case 53://Trousers of the Sky
                mat1L1.setText("1x Sapphire");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("3x Sapphire");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("5x Sapphire");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("10x Sapphire");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("Legends say these trousers were once worn by a hero who appeared " +
                        "from the sky riding a mighty bird. It was the official garb of a certain order of knights.");
                break;
            case 54://Trousers of the Wild
                mat1L1.setText("10x Acorn");
                mat2L1.setText("2x Dinraal's Scale");
                mat1L2.setText("5x Courser Bee Honey");
                mat1L3.setText("2x Dinraal's Claw");
                mat2L2.setText("5x Energetic Rhino Beetle");
                mat2L3.setText("2x Shard of Dinraal's Fang");
                mat1L4.setText("1x Star Fragment");
                mat2L4.setText("2x Shard of Dinraal's Horn");
                descrip.setText("Legends says these pants were tailored for a hero who travels the " +
                        "wilderness. Strangely enough, they're the most comfortable pair of pants you've ever worn.");
                break;
            case 55://Trousers of the Wind
                mat1L1.setText("3x Opal");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("5x Opal");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("10x Opal");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("20x Opal");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("Legends say these trousers were cherished by a hero who sailed the " +
                        "Great Sea. They're water-resistant, naturally.");
                break;
            case 56://Trousers of Time
                mat1L1.setText("5x Amber");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("5x Amber");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("15x Amber");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("30x Amber");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("Legends say these trousers were once worn by a hero who traveled " +
                        "through time. They were originally made by people who made their home in the forest.");
                break;
            case 57://Trousers of Twilight
                mat1L1.setText("1x Topaz");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("3x Topaz");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("5x Topaz");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("10x Topaz");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("Legends say these trousers were once worn by a hero who battled the " +
                        "beasts of twilight. The insides are lined with cozy wolf fur.");
                break;
            case 58://Tunic of Hero
                mat1L1.setText("1x Ruby");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("3x Ruby");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("5x Ruby");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("10x Ruby");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("Legend has it this armor was once cherished by a hero from ancient " +
                        "times. Its design is rather simple, but it's such a traditional look.");
                break;
            case 59://Tunic of the Sky
                mat1L1.setText("1x Sapphire");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("3x Sapphire");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("5x Sapphire");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("10x Sapphire");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("Legend has it this armor was once worn by a hero who appeared from " +
                        "the sky riding atop a mighty bird. Apparently it was presented to celebrate the completion of a ceremony.");
                break;
            case 60://Tunic of the Wild
                mat1L1.setText("10x Acorn");
                mat2L1.setText("2x Naydra's Scale");
                mat1L2.setText("5x Coruser Bee Honey");
                mat2L2.setText("2x Naydra's Claw");
                mat1L3.setText("5x Energetic Rhino Beetle");
                mat2L3.setText("2x Shard of Naydra's Fang");
                mat1L4.setText("1x Star Fragment");
                mat2L4.setText("2x Shard of Naydra's Horn");
                descrip.setText("This armor was apparently crafted for a hero who travels the wilds. " +
                        "Strangely enough, it's just your size.");
                break;
            case 61://Tunic of the Wind
                mat1L1.setText("3x Opal");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("5x Opal");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("10x Opal");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("20x Opal");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("Legend has it this armor was once cherished by a hero who sailed " +
                        "the Great Sea. It's said to have been a gift from his grandmother.");
                break;
            case 62://Tunic of Time
                mat1L1.setText("5x Amber");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("5x Amber");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("15x Amber");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("30x Amber");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("Legend has it this armor was once worn by a hero who traveled " +
                        "through time. Strangely, its special design is fitted for children and adults alike.");
                break;
            case 63://Tunic of Twilight
                mat1L1.setText("1x Topaz");
                mat2L1.setText("1x Star Fragment");
                mat1L2.setText("3x Topaz");
                mat2L2.setText("2x Star Fragment");
                mat1L3.setText("5x Topaz");
                mat2L3.setText("3x Star Fragment");
                mat1L4.setText("10x Topaz");
                mat2L4.setText("4x Star Fragment");
                descrip.setText("Legend has it this armor was once worn by a hero who battled the " +
                        "monsters of twilight. There still seems to be some hair clinging to it... Looks like it may be from a wolf?");
                break;
            case 64://Zora Armor
                mat1L1.setText("3x Lizalfos Horn");
                mat2L1.setText("-");
                mat1L2.setText("5x Lizalfos Talon");
                mat2L2.setText("5x Hyrule Bass");
                mat1L3.setText("5x Lizalfos Tail");
                mat2L3.setText("5x Hearty Bass");
                mat1L4.setText("10x Lizalfos Tail");
                mat2L4.setText("15x Opal");
                descrip.setText("Custom armor painstakingly crafted by each generation's Zora " +
                        "princess for her future husband. Wearing it will give you the ability to swim up waterfalls.");
                break;
            case 65://Zora Greaves
                mat1L1.setText("3x Lizalfos Horn");
                mat2L1.setText("-");
                mat1L2.setText("5x Lizalfos Talon");
                mat2L2.setText("5x Hyrule Bass");
                mat1L3.setText("5x Lizalfos Tail");
                mat2L3.setText("5x Hearty Bass");
                mat1L4.setText("10x Lizalfos Tail");
                mat2L4.setText("15x Opal");
                descrip.setText("These greaves have been passed down among the Zora for generations. " +
                        "It's been said they're crafted using dragon scales. Equip them to swim faster.");
                break;
            case 66://Zora Helm
                mat1L1.setText("3x Lizalfos Horn");
                mat2L1.setText("-");
                mat1L2.setText("5x Lizalfos Talon");
                mat2L2.setText("5x Hyrule Bass");
                mat1L3.setText("5x Lizalfos Tail");
                mat2L3.setText("5x Hearty Bass");
                mat1L4.setText("10x Lizalfos Tail");
                mat2L4.setText("15x Opal");
                descrip.setText("Zora headgear made from dragon scales. Increases swimming speed " +
                        "and allows you to use Spin Attack.");
                break;
        }
    }
}
