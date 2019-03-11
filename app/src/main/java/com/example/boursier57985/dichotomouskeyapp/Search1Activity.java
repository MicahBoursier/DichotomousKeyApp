package com.example.boursier57985.dichotomouskeyapp;

import android.support.annotation.Nullable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class Search1Activity extends AppCompatActivity {

    public static final String EXTRA_NAME = "com.example.DichotomousKeyApp.MESSAGE";
    public static final String EXTRA_DESC = "com.example.DichotomousKeyApp.MESSAGE";
    Button buttonA;
    Button buttonB;
    Button buttonC;
    Button buttonD;
    Button buttonE;
    Button buttonF;
    Button buttonG;
    Button buttonH;
    Button buttonI;
    Button buttonJ;
    Button buttonK;
    Button buttonL;
    Button buttonM;
    Button buttonN;
    Button buttonO;
    Button buttonP;
    Button buttonQ;
    Button buttonR;
    Button buttonS;
    Button buttonT;
    Button buttonU;
    Button buttonV;
    Button buttonW;
    int screen;
    Button buttons[] = new Button[23];
    List<Integer> scrPath = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        screen = getIntent().getIntExtra("EXTRA_START_SCREEN", 0);
        setContentView(R.layout.activity_search1);
        SetScreenOnStart(screen);
        buttonA = (Button)findViewById(R.id.buttonA);
        buttonB = (Button)findViewById(R.id.buttonB);
        buttonC = (Button)findViewById(R.id.buttonC);
        buttonD = (Button)findViewById(R.id.buttonD);
        buttonE = (Button)findViewById(R.id.buttonE);
        buttonF = (Button)findViewById(R.id.buttonF);
        buttonG = (Button)findViewById(R.id.buttonG);
        buttonH = (Button)findViewById(R.id.buttonH);
        buttonI = (Button)findViewById(R.id.buttonI);
        buttonJ = (Button)findViewById(R.id.buttonJ);
        buttonK = (Button)findViewById(R.id.buttonK);
        buttonL = (Button)findViewById(R.id.buttonL);
        buttonM = (Button)findViewById(R.id.buttonM);
        buttonN = (Button)findViewById(R.id.buttonN);
        buttonO = (Button)findViewById(R.id.buttonO);
        buttonP = (Button)findViewById(R.id.buttonP);
        buttonQ = (Button)findViewById(R.id.buttonQ);
        buttonR = (Button)findViewById(R.id.buttonR);
        buttonS = (Button)findViewById(R.id.buttonS);
        buttonT = (Button)findViewById(R.id.buttonT);
        buttonU = (Button)findViewById(R.id.buttonU);
        buttonV = (Button)findViewById(R.id.buttonV);
        buttonW = (Button)findViewById(R.id.buttonW);
        screen = 1;
        buttons = new Button[23];
        buttons[0] = buttonA;
        buttons[1] = buttonB;
        buttons[2] = buttonC;
        buttons[3] = buttonD;
        buttons[4] = buttonE;
        buttons[5] = buttonF;
        buttons[6] = buttonG;
        buttons[7] = buttonH;
        buttons[8] = buttonI;
        buttons[9] = buttonJ;
        buttons[10] = buttonK;
        buttons[11] = buttonL;
        buttons[12] = buttonM;
        buttons[13] = buttonN;
        buttons[14] = buttonO;
        buttons[15] = buttonP;
        buttons[16] = buttonQ;
        buttons[17] = buttonR;
        buttons[18] = buttonS;
        buttons[19] = buttonT;
        buttons[20] = buttonU;
        buttons[21] = buttonV;
        buttons[22] = buttonW;
        hideButtons (buttonB);
    }

    public void SetScreenOnStart(int scr) {
        if (scr == 1) {
            setsc1();
        } else if (scr == 2) {
            setsc2();
        } else if (scr == 3) {
            setsc3();
        } else if (scr == 4) {
            setsc4();
        } else if (scr == 5) {
            setsc5();
        } else if (scr == 6) {
            setsc6();
        } else if (scr == 7) {
            setsc7();
        } else if (scr == 8) {
            setsc8();
        } else if (scr == 9) {
            setsc9();
        } else if (scr == 10) {
            setsc10();
        } else if (scr == 11) {
            setsc11();
        } else if (scr == 12) {
            setsc12();
        } else if (scr == 13) {
            setsc13();
        } else if (scr == 14) {
            setsc14();
        } else if (scr == 15) {
            setsc15();
        } else if (scr == 16) {
            setsc16();
        } else if (scr == 17) {
            setsc17();
        } else if (scr == 18) {
            setsc18();
        } else if (scr == 19) {
            setsc19();
        } else if (scr == 20) {
            setsc20();
        } else if (scr == 21) {
            setsc21();
        } else if (scr == 22) {
            setsc22();
        } else if (scr == 23) {
            setsc23();
        } else if (scr == 24) {
            setsc24();
        } else if (scr == 25) {
            setsc25();
        } else if (scr == 26) {
            setsc26();
        } else if (scr == 27) {
            setsc27();
        } else if (scr == 28) {
            setsc28();
        } else if (scr == 29) {
            setsc29();
        } else if (scr == 30) {
            setsc30();
        } else if (scr == 31) {
            setsc31();
        } else if (scr == 32) {
            setsc32();
        } else if (scr == 33) {
            setsc33();
        } else if (scr == 34) {
            setsc34();
        } else if (scr == 35) {
            setsc35();
        } else if (scr == 36) {
            setsc36();
        } else if (scr == 37) {
            setsc37();
        } else if (scr == 38) {
            setsc38();
        } else if (scr == 39) {
            setsc39();
        } else if (scr == 40) {
            setsc40();
        } else if (scr == 41) {
            setsc41();
        }
    }

    public void birdScr(View view, String name, String desc) {
        Intent intent = new Intent(this, BirdScreen.class);
        Bundle extras = new Bundle();
        extras.putString("EXTRA_NAME", name);
        extras.putString("EXTRA_DESC", desc);
        extras.putInt("EXTRA_SCR", screen);
        intent.putExtras(extras);
        startActivity(intent);
    }

    public void hideButtons (Button b) {
        int tempTag = Integer.parseInt(b.getTag().toString());
        for (int i = 0; i < 23; i++) {
            if (Integer.parseInt(buttons[i].getTag().toString()) > tempTag) {
                buttons[i].setVisibility(View.GONE);
            } else {
                buttons[i].setVisibility(View.VISIBLE);
            }
        }
    }

    public void backTransform (View view) {
        if (screen == 2) {
            setsc1();
        } else if (screen == 3) {
            setsc1();
        } else if (screen == 4) {
            setsc3();
        } else if (screen == 5) {
            setsc4();
        } else if (screen == 6) {
            setsc5();
        } else if (screen == 7) {
            setsc3();
        } else if (screen == 8) {
            setsc7();
        } else if (screen == 9) {
            setsc7();
        } else if (screen == 10) {
            setsc9();
        } else if (screen == 11) {
            setsc10();
        } else if (screen == 12) {
            setsc11();
        } else if (screen == 13) {
            setsc12();
        } else if (screen == 14) {
            setsc11();
        } else if (screen == 15) {
            setsc14();
        } else if (screen == 16) {
            setsc9();
        } else if (screen == 17) {
            setsc16();
        } else if (screen == 18) {
            setsc16();
        } else if (screen == 19) {
            setsc18();
        } else if (screen == 20) {
            setsc18();
        } else if (screen == 21) {
            setsc20();
        } else if (screen == 22) {
            setsc21();
        } else if (screen == 23) {
            setsc22();
        } else if (screen == 24) {
            setsc21();
        } else if (screen == 25) {
            setsc24();
        } else if (screen == 26) {
            setsc25();
        } else if (screen == 27) {
            setsc25();
        } else if (screen == 28) {
            setsc24();
        } else if (screen == 29) {
            setsc28();
        } else if (screen == 30) {
            setsc29();
        } else if (screen == 31) {
            setsc28();
        } else if (screen == 32) {
            setsc31();
        } else if (screen == 33) {
            setsc32();
        } else if (screen == 34) {
            setsc32();
        } else if (screen == 35) {
            setsc20();
        } else if (screen == 36) {
            setsc35();
        } else if (screen == 37) {
            setsc35();
        } else if (screen == 38) {
            setsc37();
        } else if (screen == 39) {
            setsc37();
        } else if (screen == 40) {
            setsc37();
        } else if (screen == 41) {
            setsc37();
        }
    }

    public void transformA (View view) {
        if (screen == 1) {
            setsc2();
        } else if (screen == 2) {
            birdScr(view, "Family Pelecanidae", "Pelicans are a genus of large water birds that make up the family Pelecanidae. They are characterised by a long beak and a large throat pouch used for catching prey and draining water from the scooped-up contents before swallowing.");
        } else if (screen == 3) {
            setsc4();
        } else if (screen == 4) {
            setsc5();
        } else if (screen == 5) {
            birdScr(view, "Family Diomedidae", "The family Diomedeidae currently includes 21 species in four genera, Diomedea, Thalassarche, Phoebastria and Phoebetria. The albatrosses are among the largest of flying bird species and are powerful fliers. Their courtship displays are spectacular with elaborate rituals. They are usually colonial nesters and some colonies show high nest density.");
        } else if (screen == 6) {
            birdScr(view, "Genus Fulmarus", "The fulmars are tubenosed seabirds of the family Procellariidae. The family consists of two extant species and two extinct fossil species from the Miocene. Fulmars superficially resemble gulls, but are readily distinguished by their flight on stiff wings, and their tube noses.");
        } else if (screen == 7) {
            setsc8();
        } else if (screen == 8) {
          birdScr(view, "Family Apodidae", "The common swift is a medium-sized bird, superficially similar to the barn swallow or house martin but somewhat larger, though not stemming from those passerine species, being in the order Apodiformes. The resemblances between the groups are due to convergent evolution, reflecting similar contextual development.");
        } else if (screen == 9) {
            setsc10();
        } else if (screen == 10) {
            setsc11();
        } else if (screen == 11) {
            setsc12();
        } else if (screen == 12) {
            setsc13();
        } else if (screen == 13) {
           birdScr(view, "Family Strigidae", "The family Strigidae is the larger of the two families of owls, with close to 190 species distributed among 25 genera. The internal taxonomy is very complicated, owing in part to the similarities between species, and in part to the fact that many have been little studied. They are found worldwide, on every continent of the world except Antarctica, but 80% of the strigids are found in the tropics. Strigid owls cover nearly all terrestrial habitats, though 95% are forest-dwelling species.");
        } else if (screen == 14) {
            setsc15();
        } else if (screen == 15) {
            birdScr(view, "Family Capitonidae", "New World barbets, family Capitonidae, are near passerine birds of the order Piciformes which inhabit humid forests in Central and South America. They are closely related to the toucans. The New World barbets are plump birds, with short necks and large heads. They get their name from the bristles which fringe their heavy bills. Most species are brightly coloured and live in tropical forest.");
        } else if (screen == 16) {
            setsc17();
        } else if (screen == 17) {
            birdScr(view, "Family Gaviidae", "Loon. The loons (North America) or divers (Great Britain/Ireland) are a group of aquatic birds found in many parts of North America and northern Eurasia. All living species of loons are members of the genus Gavia, family Gaviidae and order Gaviiformes.");
        } else if (screen == 18) {
            setsc18();
        } else if (screen == 19) {
            birdScr(view, "Family Accipitridae", "The Family Accipitridae includes ten natural groups of raptors such as kites, fish-eagles, Old World vultures, snake-eagles, harriers, sparrowhawks, hawks, buzzards, large eagles and booted eagles. They occur in the whole world.");
        } else if (screen == 20) {
            setsc21();
        } else if (screen == 21) {
            setsc22();
        } else if (screen == 22) {
            setsc23();
        } else if (screen == 23) {
            birdScr(view, "Olor columbianus", "The tundra swan is a small Holarctic swan. The two taxa within it are usually regarded as conspecific, but are also sometimes split into two species: Bewick's swan of the Palaearctic and the whistling swan proper of the Nearctic.");
        } else if (screen == 24) {
            setsc25();
        } else if (screen == 25) {
            setsc26();
        } else if (screen == 26) {
            birdScr(view, "Branta canadensis", "The Canada goose is a large wild goose species with a black head and neck, white cheeks, white under its chin, and a brown body. Native to arctic and temperate regions of North America, its migration occasionally reaches northern Europe.");
        } else if (screen == 27) {
            birdScr(view, "Genus Anser", "The waterfowl genus Anser includes all grey geese. Its name is derived from anser the Latin for \"goose\". It belongs to the true geese and swan subfamily.");
        } else if (screen == 28) {
            setsc29();
        } else if (screen == 29) {
            setsc30();
        } else if (screen == 30) {
            birdScr(view, "Mergus merganser", "The common merganser or goosander is a large duck of rivers and lakes in forested areas of Europe, northern and central Asia, and North America. The common merganser eats fish and nests in holes in trees.");
        } else if (screen == 31) {
            setsc32();
        } else if (screen == 32) {
            setsc33();
        } else if (screen == 33) {
            birdScr(view, "Genus Oxyura", "The stiff-tailed ducks, Oxyura, are part of the Oxyurini tribe of ducks. The genus name is derived from Ancient Greek oxus, \"sharp\", and oura, \"tail\". All have, as their name implies, long, stiff tail feathers, which are erected when the bird is resting. All have relatively large, swollen bills.");
        } else if (screen == 34) {
            birdScr(view, "Genus Spathula", "The northern shoveler, known simply in Britain as the shoveler, is a common and widespread duck. It breeds in northern areas of Europe and Asia and across most of North America, wintering in southern Europe, Africa, the Indian subcontinent, Southeast Asia, and Central, and northern South America.");
        } else if (screen == 35) {
            setsc36();
        } else if (screen == 36) {
            birdScr(view, "Family Ardeidae", "Ardeidae is a family of birds in the order Pelecaniformes. They are medium to large wading birds found mostly on coastal and inland waterways. There are 18 Ardeidae Genus with approximately 66 species.");
        } else if (screen == 37) {
            setsc38();
        } else if (screen == 38) {
            birdScr(view, "Family Tyrannidae", "The tyrant flycatchers (Tyrannidae) are a family of passerine birds which occur throughout North and South America. They are considered the largest family of birds, with more than 400 species. They are the most diverse avian family in every country in the Americas, except for the United States and Canada.");
        } else if (screen == 39) {
            birdScr(view, "Family Charadriidae", "The bird family Charadriidae includes the plovers, dotterels, and lapwings, about 64 to 66 species in all.");
        } else if (screen == 40) {
            birdScr(view, "Family Rallidae", "Coots are small water birds that are members of the rail family, Rallidae. They constitute the genus Fulica, the name being the Latin for \"coot\". Coots have predominantly black plumage, and—unlike many rails—they are usually easy to see, often swimming in open water. They are close relatives of the moorhen.");
        } else if (screen == 41){
            birdScr(view,"Family Tetraonidae","Family Tetraonidae - Grouses. This natural and fairly homogeneous group belongs to the order Galliformes, and is sometimes regarded as a subfamily within the Phasianidae.");
        }
    }

    public void transformB (View view) {
        if (screen == 1) {
            setsc3();
        } else if (screen == 2) {
            birdScr(view, "Family Sulidae", "The bird family Sulidae comprises the gannets and boobies. Collectively called sulids, they are medium-large coastal seabirds that plunge-dive for fish and similar prey. The ten species in this family are often considered congeneric in older sources, placing all in the genus Sula. However, Sula (true boobies) and Morus (gannets) can be readily distinguished by morphological, behavioral, and DNA sequence characters.");
        } else if (screen == 3) {
            setsc7();
        } else if (screen == 4) {
            birdScr(view, "Family Caprimulgidae", "Caprimulgidae, bird family of the order Caprimulgiformes. Birds of this family are commonly called nightjars, from their jarring cries, or goatsuckers, from the ancient superstition that they used their very wide mouths to milk goats. They are insectivorous birds that take flying insects on the wing, usually at night.");
        } else if (screen == 5) {
            setsc6();
        } else if (screen == 6) {
            birdScr(view, "Genus Puffinus", "Puffinus is a genus of seabirds in the order Procellariiformes. It comprises about 20 small to medium-sized shearwaters. Two other shearwater genera are named: Calonectris, which comprises three or four large shearwaters, and Ardenna with another seven species.");
        } else if (screen == 7) {
            setsc9();
        } else if (screen == 8) {
            birdScr(view, "Family Hemiprocnidae", "Treeswifts or crested swifts are a family, Hemiprocnidae, of aerial near passerine birds, closely related to the true swifts. Treeswifts are small to medium-sized swifts, ranging in length from 15–30 cm. They have long wings, with most of the length coming from the length of the primaries; their arms are actually quite short.");
        } else if (screen == 9) {
            setsc16();
        } else if (screen == 10) {
            birdScr(view, "Family Trogonidae", "The trogons and quetzals are birds in the order Trogoniformes which contains only one family, the Trogonidae. The family contains 39 species in seven genera. The fossil record of the trogons dates back 49 million years to the Early Eocene. They might constitute a member of the basal radiation of the order Coraciiformes[1] or be closely related to mousebirds and owls.");
        } else if (screen == 11) {
            setsc14();
        } else if (screen == 12) {
            birdScr(view, "Family Psittacidae", "The family Psittacidae is one of three families of true parrots. It comprises the rough 10 species of subfamily Psittacinae (the Old World or Afrotropical parrots) and 157 of subfamily Arinae (the New World or Neotropical parrots), as well as several species that have gone extinct in recent centuries.[1][2] Some of the most iconic birds in the world are represented here, such as the blue-and-gold macaw among the New World parrots and the grey parrot among the Old World parrots.");
        } else if (screen == 13) {
            birdScr(view, "Family Tytonidae", "Barn owls (family Tytonidae) are one of the two families of owls, the other being the true owls or typical owls, Strigidae. They are medium to large owls with large heads and characteristic heart-shaped faces. They have long, strong legs with powerful talons.");
        } else if (screen == 14) {
            birdScr(view, "Family Cuculidae", "The cuckoos are a family of birds, Cuculidae, the sole taxon in the order Cuculiformes.[1][2][3] The cuckoo family includes the common or European cuckoo, roadrunners, koels, malkohas, couas, coucals and anis. The coucals and anis are sometimes separated as distinct families, the Centropodidae and Crotophagidae respectively.");
        } else if (screen == 15) {
            birdScr(view, "Family Indicatoridae", "Honeyguides (family Indicatoridae) are a near passerine bird species of the order Piciformes. They are also known as indicator birds, or honey birds, although the latter term is also used more narrowly to refer to species of the genus Prodotiscus. They have an Old World tropical distribution, with the greatest number of species in Africa and two in Asia. These birds are best known for their interaction with humans.");
        } else if (screen == 16) {
            setsc18();
        } else if (screen == 17) {
            birdScr(view, "Family Podicipedidae", "Grebes, Podicipediformes, are a widely distributed order of freshwater diving birds, some of which visit the sea when migrating and in winter. This order contains only a single family, the Podicipedidae, containing 22 species in six extant genera.");
        } else if (screen == 18) {
            setsc20();
        } else if (screen == 19) {
            birdScr(view, "Family Cathartidae", "The New World vulture or condor family Cathartidae contains seven species in five genera, all but one of which are monotypic. It includes five vultures and two condors found in warm and temperate areas of the Americas.");
        } else if (screen == 20) {
            setsc35();
        } else if (screen == 21) {
            setsc24();
        } else if (screen == 22) {
            birdScr(view, "Cygnus olor", "The mute swan is a species of swan and a member of the waterfowl family Anatidae. It is native to much of Eurasia, and the far north of Africa. It is an introduced species in North America, Australasia and southern Africa. The name 'mute' derives from it being less vocal than other swan species.");
        } else if (screen == 23) {
            birdScr(view, "Olor buccinator", "The trumpeter swan (Cygnus buccinator) is a species of swan found in North America. The heaviest living bird native to North America, it is also the largest extant species of waterfowl with a wingspan that may exceed 10 ft (3.0 m).[2] It is the American counterpart and a close relative of the whooper swan (Cygnus cygnus) of Eurasia, and even has been considered the same species by some authorities.");
        } else if (screen == 24) {
            setsc28();
        } else if (screen == 25) {
            setsc27();
        } else if (screen == 26) {
            birdScr(view, "Branta bernicla", "The brant, or brent goose, is a species of goose of the genus Branta. The black brant is a pacific North American subspecies. The Brent System, a major oilfield, was named after the species.");
        } else if (screen == 27) {
            birdScr(view, "Philacte canagica", "The emperor goose, also known as the beach goose or the painted goose, is a waterfowl species in the family Anatidae, which contains the ducks, geese, and swans. It is blue-gray in color as an adult and grows to 66–71 centimetres in length.");
        } else if (screen == 28) {
            setsc31();
        } else if (screen == 29) {
            birdScr(view, "Lophodytes cucullatus", "The hooded merganser is a species of small duck. It is the only extant species in the genus Lophodytes. The genus name derives from the Greek language: lophos meaning 'crest', and dutes meaning diver.");
        } else if (screen == 30) {
            birdScr(view, "Mergus serrator", "The red-breasted merganser is a diving duck, one of the sawbills. The genus name is a Latin word used by Pliny and other Roman authors to refer to an unspecified waterbird, and serrator is a sawyer from Latin serra, \"saw\".");
        } else if (screen == 31) {
            birdScr(view, "Genus Dendrocygna", "The whistling ducks or tree ducks are a subfamily, Dendrocygninae, of the duck, goose and swan family of birds, Anatidae. They are not true ducks. In other taxonomic schemes, they are considered a separate family, Dendrocygnidae.");
        } else if (screen == 32) {
            setsc34();
        } else if (screen == 33) {
            birdScr(view, "Genus Somateria", "Eiders are large seaducks in the genus Somateria. The scientific name is derived from Ancient Greek somatos \"body\" and erion \"wool\", referring to eiderdown. The three extant species all breed in the cooler latitudes of the Northern Hemisphere.");
        } else if (screen == 34) {
            birdScr(view, "Genus Aix", "Aix is a bird genus that contains two species of ducks: the wood duck, and the Mandarin duck. Aix is an Ancient Greek word used by Aristotle to refer to an unknown diving bird.");
        } else if (screen == 35) {
            setsc37();
        } else if (screen == 36) {
            birdScr(view, "Family Ciconiidae", "Storks are large, long-legged, long-necked wading birds with long, stout bills. They belong to the family called Ciconiidae, and make up the order Ciconiiformes. Ciconiiformes previously included a number of other families, such as herons and ibises, but those families have been moved to other orders.");
        } else if (screen == 37) {
            setsc39();
        } else if (screen == 38) {
            birdScr(view, "Family Menuridae", "A lyrebird is either of two species of ground-dwelling Australian birds that compose the genus Menura, and the family Menuridae. They are most notable for their superb ability to mimic natural and artificial sounds from their environment, and the striking beauty of the male bird's huge tail when it is fanned out in courtship display. Lyrebirds have unique plumes of neutral-coloured tailfeathers and are among Australia's best-known native birds.");
        } else if (screen == 39) {
            birdScr(view, "Family Scolopacidae", "Sandpipers are a large family, Scolopacidae, of waders or shorebirds. They include many species called sandpipers, as well as those called by names such as curlew and snipe. The majority of these species eat small invertebrates picked out of the mud or soil. Different lengths of bills enable different species to feed in the same habitat, particularly on the coast, without direct competition for food.");
        } else if (screen == 40) {
            birdScr(view, "Family Gruidae", "Cranes are a family, the Gruidae, of large, long-legged, and long-necked birds in the group Gruiformes. The 15 species of cranes are placed in four genera. Unlike the similar-looking but unrelated herons, cranes fly with necks outstretched, not pulled back. Cranes live on all continents except Antarctica and South America.");
        } else if (screen == 41) {
            birdScr(view, "Family Phasianidae", "The Phasianidae are a family of heavy, ground-living birds, which includes pheasants, partridges, junglefowl, chickens, turkeys, Old World quail, and peafowl. The family includes many of the most popular gamebirds.");
        }
    }

    public void transformC (View view) {
        if (screen == 2) {
            birdScr(view, "Family Phalacrocoracidae", "Phalacrocoracidae is a family of approximately 40 species of aquatic birds commonly known as cormorants and shags. Several different classifications of the family have been proposed recently, and the number of genera is disputed.");
        } else if (screen == 7) {
            birdScr(view, "Family Spheniscidae", "Penguins (order Sphenisciformes, family Spheniscidae) are an order of flightless birds living in the southern hemisphere. They are not, contrary to popular belief, only found in cold climates, such as Antarctica. Many species live as far north as the Galapagos Islands and will occasionally cross the equator while feeding.");
        } else if (screen == 8) {
            birdScr(view, "Family Trochilidae", "Hummingbirds are birds native to the Americas and constitute the biological family Trochilidae. They are among the smallest of birds, most species measuring 7.5–13 cm (3–5 in) in length. The smallest extant bird species is a hummingbird, the 5 cm (2.0 in) bee hummingbird weighing less than 2.0 g (0.07 oz).");
        } else if (screen == 15) {
            birdScr(view, "Family Galbulidae", "The jacamars are a family, Galbulidae, of near passerine birds from tropical South and Central America, extending up to Mexico. The family contains five genera and 18 species. The family is closely related to the puffbirds, another Neotropical family, and the two families are often separated into their own order, Galbuliformes, separate from the Piciformes.");
        } else if (screen == 19) {
            birdScr(view, "Family Falconidae", "The falcons and caracaras are around 60 species of diurnal birds of prey that make up the family Falconidae. The family is divided into two subfamilies, Polyborinae, which includes the caracaras and forest falcons, and Falconinae, the falcons, kestrels and falconets (Microhierax and Spiziapteryx).");
        } else if (screen == 33) {
            birdScr(view, "Genus Aythya", "Aythya is a genus of diving ducks. It has twelve described species. The name Aythya comes from the Ancient Greek word αυθυια, aithuia, which may have referred to a sea-dwelling duck or an auklet. Aythya shihuibas was described from the Late Miocene of China.");
        } else if (screen == 36) {
            birdScr(view, "Family Threskiornithidae", "The family Threskiornithidae includes 34 species of large wading birds. The family has been traditionally classified into two subfamilies, the ibises and the spoonbills; however recent genetic studies are casting doubt on the arrangement, and revealing the spoonbills to be nested within the old world ibises, and the new world ibises as an early offshoot.");
        } else if (screen == 37) {
            setsc40();
        } else if (screen == 38) {
            birdScr(view, "Family Alaudidae", "Larks are passerine birds of the family Alaudidae. Larks have a cosmopolitan distribution with the largest number of species occurring in Africa. Only a single species, the horned lark, occurs in North America, and only Horsfield's bush lark occurs in Australia. Habitats vary widely, but many species live in dry regions.");
        } else if (screen == 39) {
            birdScr(view, "Family Laridae", "Laridae is a family of seabirds in the order Charadriiformes that includes the gulls, terns and skimmers. It includes around 100 species arranged into 22 genera. They are an adaptable group of mostly aerial birds found worldwide.");
        } else if (screen == 40) {
            birdScr(view, "Family Aramidae", "The limpkin (Aramus guarauna), also called carrao, courlan, and crying bird, is a bird that looks like a large rail, but is skeletally closer to cranes. It is the only extant species in the genus Aramus and the family Aramidae. It is found mostly in wetlands in warm parts of the Americas, from Florida to northern Argentina. It feeds on molluscs, with the diet dominated by apple snails of the genus Pomacea.");
        } else if (screen == 41) {
            birdScr(view, "Family Numididae", "Guineafowl (/ˈɡɪnifaʊl/; sometimes called \"pet speckled hen\", or \"original fowl\") are birds of the family Numididae in the order Galliformes. They are endemic to Africa and rank among the oldest of the gallinaceous birds. Phylogenetically, they branch off from the core Galliformes after the Cracidae and before the Odontophoridae. An Eocene fossil lineage, Telecrex, has been associated with guineafowl.");
        }
    }

    public void transformD (View view) {
        if (screen == 2) {
            birdScr(view, "Family Frigatidae", "Frigatebirds (also listed as \"frigate bird\", \"frigate-bird\", \"frigate\", \"frigate-petrel\")[1] are a family of seabirds called Fregatidae which are found across all tropical and subtropical oceans. The five extant species are classified in a single genus, Fregata. All have predominantly black plumage, long, deeply forked tails and long hooked bills. Females have white underbellies and males have a distinctive red gular pouch.");
        } else if (screen == 7) {
            birdScr(view, "Struthio camelus", "The common ostrich, or simply ostrich, is a species of large flightless bird native to Africa. It is one of two extant species of ostriches, the only living members of the genus Struthio in the ratite order of birds.");
        } else if (screen == 15) {
            birdScr(view, "Family Bucconidae", "The puffbirds and their relatives in the near passerine family Bucconidae are tropical tree-dwelling insectivorous birds that are found from South America up to Mexico. Together with their closest relatives, the jacamars, they form a divergent lineage within the order Piciformes, though the two families are sometimes elevated to a separate order Galbuliformes.");
        } else if (screen == 19) {
            birdScr(view, "Family Pandionidae", "Pandion is a genus of birds of prey, known as ospreys, the only genus of family Pandionidae. Some taxonomic treatments have regarded this genus as describing a single extant species, separated to subspecies or races, while other treatments recognize two extant species.");
        } else if (screen == 33) {
            birdScr(view, "Genus Melanitta", "The scoters are stocky seaducks in the genus Melanitta. The drakes are mostly black and have swollen bills. Females are brown. The genus name is derived from Ancient Greek melas \"black\" and netta \"duck\".");
        } else if (screen == 36) {
            birdScr(view, "Family Phoenicopterae", "Flamingos and their relatives are well attested in the fossil record, with the first unequivocal member of the Phoenicopteridae, Elornis known from the late Eocene epoch. A considerable number of little-known birds from the Late Cretaceous onwards are sometimes considered to be flamingo ancestors.");
        } else if (screen == 37) {
            setsc41();
        } else if (screen == 38) {
            birdScr(view, "Family Hirundinidae", "The swallows, martins and saw-wings, or Hirundinidae, are a family of passerine birds found around the world on all continents, including occasionally in Antarctica. Highly adapted to aerial feeding, they have a distinctive appearance. The term Swallow is used colloquially in Europe as a synonym for the barn swallow.");
        } else if (screen == 39) {
            birdScr(view, "Family Stercorariidae", "The skuas /ˈskjuːə/ are a group of predatory seabirds with about seven species forming the family Stercorariidae and the genus Stercorarius. The three smaller skuas are called jaegers in American English.");
        } else if (screen == 41) {
            birdScr(view, "Family Meleagrididae", "Meleagridinae is a subfamily of birds in the family Phasianidae. It includes turkeys and their extinct relatives.");
        }
    }

    public void transformE (View view) {
        if (screen == 2) {
            birdScr(view, "Family Phaethontidae", "Tropicbirds are a family, Phaethontidae, of tropical pelagic seabirds. They are the sole living representatives of the order Phaethontiformes.");
        } else if (screen == 7) {
            birdScr(view, "Genus Rhea", "The rheas are large ratites in the order Rheiformes, native to South America, distantly related to the ostrich and emu. Most taxonomic authorities recognize two extant species: the greater or American rhea and the lesser or Darwin's rhea. The IUCN lists the puna rhea as a separate species.");
        } else if (screen == 15) {
            birdScr(view, "Family Ramphastidae", "Toucans (/ˈtuːkæn/, UK: /-kən/) are members of the Neotropical near passerine bird family Ramphastidae. The Ramphastidae are most closely related to the American barbets. They are brightly marked and have large, often-colorful bills. The family includes five genera and over forty different species.");
        } else if (screen == 19) {
            birdScr(view, "Family Sagittaridae", "The secretarybird or secretary bird (Sagittarius serpentarius) is a very large, mostly terrestrial bird of prey. Endemic to Africa, it is usually found in the open grasslands and savannah of the sub-Saharan region. Although a member of the order Accipitriformes, which also includes many other diurnal raptors such as kites, hawks, vultures, and harriers, it is given its own family, Sagittariidae.");
        } else if (screen == 33) {
            birdScr(view, "Camptorhynchus labradorius", "The Labrador duck was a North American bird; it has the distinction of being the first endemic North American bird species to become extinct after the Columbian Exchange, with the last known sighting occurring in 1878 in Elmira, New York.");
        } else if (screen == 37) {
            birdScr(view, "Order Coraciiformes", "The Coraciiformes are a group of usually colorful birds including the kingfishers, the bee-eaters, the rollers, the motmots, and the todies. They generally have syndactyly, with three forward-pointing toes, though in many kingfishers one of these is missing.");
        } else if (screen == 38) {
            birdScr(view, "Family Corvidae", "Corvidae is a cosmopolitan family of oscine passerine birds that contains the crows, ravens, rooks, jackdaws, jays, magpies, treepies, choughs, and nutcrackers. In common English, they are known as the crow family, or, more technically, corvids. Over 120 species are described.");
        } else if (screen == 39) {
            birdScr(view, "Family Alcidae", "An auk or alcid is a bird of the family Alcidae in the order Charadriiformes. The alcid family includes the murres, guillemots, auklets, puffins, and murrelets. Apart from the extinct great auk, all auks are notable for their ability to \"fly\" under water as well as in the air.");
        } else if (screen == 41) {
            birdScr(view, "Family Opisthocomidae", "Opisthocomidae is a group of birds, the only named family within the order Opisthocomiformes. The only living representative is the hoatzin (Opisthocomus hoazin) which lives in the Amazon and the Orinoco delta in South America. Several fossil species have been identified, including one from Africa and one from Europe.");
        }
    }

    public void transformF (View view) {
        if (screen == 2) {
            birdScr(view, "Family Anhingidae", "The anhinga, sometimes called snakebird, darter, American darter, or water turkey, is a water bird of the warmer parts of the Americas. The word anhinga comes from the Brazilian Tupi language and means devil bird or snake bird.");
        } else if (screen == 7) {
            birdScr(view, "Order Dromiceidae", "Flightless ostrich like bird, can weight up to 120 pounds   Previously eaten in Australia, but several species driven to extinction   Emu Family (Dromiceidae) has only one remaining species. The Emus are large flightless birds found in the Australian region.");
        } else if (screen == 15) {
            birdScr(view, "Family Picidae", "Woodpeckers are part of the family Picidae, a group of near-passerine birds that also consist of piculets, wrynecks, and sapsuckers. Members of this family are found worldwide, except for Australia, New Guinea, New Zealand, Madagascar, and the extreme polar regions. Most species live in forests or woodland habitats, although a few species are known that live in treeless areas, such as rocky hillsides and deserts.");
        } else if (screen == 33) {
            birdScr(view, "Genus Bucephala", "Bucephala is a genus of diving ducks found in the Northern Hemisphere. The genus name is derived from Ancient Greek boukephalos, \"bullheaded\", from bous \"bull\", and kephale, \"head\", a reference to the crest of the bufflehead making its head look large.");
        } else if (screen == 37) {
            birdScr(view, "Family Columbidae", "Pigeons and doves constitute the animal family Columbidae and the order Columbiformes, which includes about 42 genera and 310 species. They are stout-bodied birds with short necks, and short slender bills that in some species feature fleshy ceres. They primarily feed on seeds, fruits, and plants. Pigeons and doves are likely the most common birds in the world.");
        } else if (screen == 38) {
            birdScr(view, "Family Paradiseidae", "The birds-of-paradise are members of the family Paradisaeidae of the order Passeriformes. The majority of species are found in eastern Indonesia, Papua New Guinea, and eastern Australia. The family has 42 species in 15 genera. The members of this family are perhaps best known for the plumage of the males of the sexually dimorphic species (the majority).");
        }
    }

    public void transformG (View view) {
        if (screen == 7) {
            birdScr(view, "Order Casuariiformes", "The Casuariiformes is an order of large flightless bird that has four surviving members: the three species of cassowary, and the only remaining species of emu. They are divided into either a single family, Casuariidae, or more typically two, with the emu splitting off into its own family, Dromaiidae.");
        } else if (screen == 33) {
            birdScr(view, "Histrionicus histrionicus", "The harlequin duck is a small sea duck. It takes its name from Harlequin, a colourfully dressed character in Commedia dell'arte. The species name comes from the Latin word \"histrio\", \"actor\". In North America it is also known as lords and ladies.");
        } else if (screen == 38) {
            birdScr(view, "Family Paridae", "The tits, chickadees, and titmice constitute the Paridae, a large family of small passerine birds which occur mainly in the Northern Hemisphere and Africa. Most were formerly classified in the genus Parus.");
        }
    }

    public void transformH (View view) {
        if (screen == 7) {
            birdScr(view, "Family Apterigidae", "Kiwi (/ˈkiːwi/ KEE-wee)[4] or kiwis are flightless birds native to New Zealand, in the genus Apteryx and family Apterygidae. Approximately the size of a domestic chicken, kiwi are by far the smallest living ratites (which also consist of ostriches, emus, rheas, and cassowaries).");
        } else if (screen == 33) {
            birdScr(view, "Clangula hyemalis", "The long-tailed duck, once known as oldsquaw, is a medium-sized sea duck. It is the only living member of its genus, Clangula. This was formerly used for the goldeneyes, with the long-tailed duck being placed in Harelda, but the latter is the type species of the genus.");
        } else if (screen == 38) {
            birdScr(view, "Family Certhiidae", "The treecreepers are a family, Certhiidae, of small passerine birds, widespread in wooded regions of the Northern Hemisphere and sub-Saharan Africa. The family contains ten species in two genera, Certhia and Salpornis. Their plumage is dull-coloured, and as their name implies, they climb over the surface of trees in search of food.");
        }
    }

    public void transformI (View view) {
        if (screen == 33) {
            birdScr(view, "Genus Anas", "Anas is a genus of dabbling ducks. It includes the pintails, most teals, and the mallard and its close relatives. It formerly included additional species but following the publication of a molecular phylogenetic study in 2009 the genus was spit into four separate genera. The genus now contains 31 living species.");
        } else if (screen == 38) {
            birdScr(view, "Family Sittidae", "The nuthatches constitute a genus, Sitta, of small passerine birds belonging to the family Sittidae. Characterised by large heads, short tails, and powerful bills and feet, nuthatches advertise their territory using loud, simple songs. Most species exhibit grey or bluish upperparts and a black eye stripe.");
        }
    }

    public void transformJ (View view) {
        if (screen == 38) {
            birdScr(view, "Family Troglodytidae", "Family Troglodytidae - Wrens. Within the huge order Passeriformes, the family Troglodytidae includes small insectivore birds. They are New World species except the Eurasian Wren (Troglodytes troglodytes) which also occurs in the Old World.");
        }
    }

    public void transformK (View view) {
        if (screen == 38) {
            birdScr(view, "Family Mimidae", "The mimids are the New World family of passerine birds, Mimidae, that includes thrashers, mockingbirds, tremblers, and the New World catbirds. As their name (Latin for \"mimic\") suggests, these birds are notable for their vocalization, especially some species' remarkable ability to mimic a wide variety of birds and other sounds heard outdoors.");
        }
    }

    public void transformL (View view) {
        if (screen == 38) {
            birdScr(view, "Family Turdidae", "The thrushes are a family, Turdidae, of passerine birds with a worldwide distribution. The family was once much larger before biologists determined the subfamily Saxicolinae, which includes the chats and European robins, were Old World flycatchers. Thrushes are small to medium-sized ground living birds that feed on insects, other invertebrates and fruit.");
        }
    }

    public void transformM (View view) {
        if (screen == 38) {
            birdScr(view, "Family Sylviidae", "Sylviidae is a family of passerine birds that includes the typical warblers, parrotbills, the wrentit, and a number of babblers formerly placed within the Old World babbler family. They are found in Eurasia, Africa, and the west coast of North America.");
        }
    }

    public void transformN (View view) {
        if (screen == 38) {
            birdScr(view, "Family Bombycillidae", "The waxwings are passerine birds classified in the genus Bombycilla. They are brown and pale grey with silky plumage, a black and white eyestripe, a crest, a square-cut tail and pointed wings. Some of the wing feathers have red tips, the resemblance of which to sealing wax gives these birds their common name. According to most authorities, this is the only genus placed in the family Bombycillidae, although Phainoptila is sometimes included.");
        }
    }

    public void transformO (View view) {
        if (screen == 38) {
            birdScr(view, "Family Laniidae", "Shrikes (/ʃraɪk/) are carnivorous passerine birds of the family Laniidae. The family is composed of 31 species in four genera. They are fairly closely related to the bush-shrike family Malaconotidae.");
        }
    }

    public void transformP (View view) {
        if (screen == 38) {
            birdScr(view, "Family Sturnidae", "Starlings are small to medium-sized passerine birds in the family Sturnidae. The name \"Sturnidae\" comes from the Latin word for starling, sturnus. Many Asian species, particularly the larger ones, are called mynas, and many African species are known as glossy starlings because of their iridescent plumage. Starlings are native to Europe, Asia and Africa, as well as northern Australia and the islands of the tropical Pacific.");
        }
    }

    public void transformQ (View view) {
        if (screen == 38) {
            birdScr(view, "Family Vireonidae", "The vireos /ˈvɪrioʊz/ make up a family, Vireonidae, of small to medium-sized passerine birds found in the New World (Canada to Argentina, including Bermuda and the West Indies) and Southeast Asia, \"Vireo\" is a Latin word referring to a green migratory bird, perhaps the female golden oriole, possibly the European greenfinch.");
        }
    }

    public void transformR (View view) {
        if (screen == 38) {
            birdScr(view, "Family Parulidae", "The New World warblers or wood-warblers are a group of small, often colorful, passerine birds which make up the family Parulidae and are restricted to the New World. They are not closely related to Old World warblers or to Australian warblers. Most are arboreal, but some, like the ovenbird and the two waterthrushes, are primarily terrestrial. Most members of this family are insectivores.");
        }
    }

    public void transformS (View view) {
        if (screen == 38) {
            birdScr(view, "Family Icteridae", "Icterids make up a family (Icteridae) of small- to medium-sized, often colorful, New-World passerine birds. Most species have black as a predominant plumage color, often enlivened by yellow, orange or red. The species in the family vary widely in size, shape, behavior and coloration. The name, meaning \"jaundiced ones\" (from the prominent yellow feathers of many species) comes from the Ancient Greek ikteros via the Latin ictericus.");
        }
    }

    public void transformT (View view) {
        if (screen == 38) {
            birdScr(view, "Family Thraupidae", "The tanagers (singular /ˈtænədʒər/) comprise the bird family Thraupidae, in the order Passeriformes. The family has an American distribution. The Thraupidae are the second-largest family of birds and represent about 4% of all avian species and 12% of the Neotropical birds.");
        }
    }

    public void transformU (View view) {
        if (screen == 38) {
            birdScr(view, "Family Fringillidae", "The true finches are small to medium-sized passerine birds in the family Fringillidae. Finches have stout conical bills adapted for eating seeds and often have colourful plumage. They occupy a great range of habitats where they are usually resident and do not migrate. They have a worldwide distribution except for Australia and the polar regions. The family includes species known as siskins, canaries, redpolls, serins, grosbeaks and euphonias.");
        }
    }

    public void transformV (View view) {
        if (screen == 38) {
            birdScr(view, "Family Ploceidae", "Ploceidae is a family of small passerine birds, many of which are called weavers, weaverbirds or weaver finches. These names come from the nests of intricately woven vegetation that many birds of the family make. In most recent classifications, Ploceidae is a clade, which excludes some birds that have historically been placed in the family, such as some of the sparrows.");
        }
    }

    private void setsc1 () {
        screen = 1;
        buttonA.setText("Back toe is connected to front toes by webbing.");
        buttonB.setText("Hind toe, if present, not as in above.");
        hideButtons(buttonB);
    }

    private void setsc2 () {
        screen = 2;
        buttonA.setText("Moderate to large size; bill with large pouch. Pelicans.");
        buttonB.setText("Bill is straight and sharp; body and legs stout; tail wedge shaped. Gannets and Boobies");
        buttonC.setText("Bill is long and hooked at end; usually uniformly dark with light, bare patches on face. Cormorants.");
        buttonD.setText("Bill is hooked at end; markings vary; face without bare patches; wings large and distinctly angled.   Frigate-Birds.");
        buttonE.setText("White with some black markings; 2 central tail feathers extend well beyond tail. Tropicbirds.");
        buttonF.setText("Bill is long, thin and pointed; head is narrow; neck is long and thin; body thickly feathered. Anhingas.");
        hideButtons(buttonF);
    }

    private void setsc3 () {
        screen = 3;
        buttonA.setText("Commonly found in or near water; nostrils are on small raised tubes.");
        buttonB.setText("Not as in above.");
        hideButtons(buttonB);
    }

    private void setsc4 () {
        screen = 4;
        buttonA.setText("Front toes are webbed; bill is hooked; wings are pointed.");
        buttonB.setText("Not as in above. Goatsuckers and relatives.");
        hideButtons(buttonB);
    }

    private void setsc5 () {
        screen = 5;
        buttonA.setText("Large; nostrils are separated by ridge down middle of bill. found in all oceans but the North Atlantic. Albatrosses.");
        buttonB.setText("Nostrils not as in above");
        hideButtons(buttonB);
    }

    private void setsc6 () {
        screen = 6;
        buttonA.setText("The base of the lower bill curves up toward the tip. Fulmars, Petrels.");
        buttonB.setText("The base of the lower bill curves down toward the tip. Shearwaters.");
        hideButtons(buttonB);
    }

    private void setsc7 () {
        screen = 7;
        buttonA.setText("Wing tip feathers are long; wing base feathers are short. Feet are tiny. Swifts and Hummingbirds.");
        buttonB.setText("Wings not as in above, but capable of flight.");
        buttonC.setText("Wings lack feathers, adapted as swimming paddles. Penguins.");
        buttonD.setText("Quite large, with long powerful legs and long neck, both largely unfeathered; only two toes per foot, with one much larger than other. Ostriches..");
        buttonE.setText("Large; head, neck, and thighs are feathered; no tail plumes. South American.  Rheas.");
        buttonF.setText("Moderate to large, with stout bodies and legs; wings quite small feathers thin and hair-like; no tail feathers. Australia. Emus..");
        buttonG.setText("Similar to 7f, but with bony \"helmet\" on head; often have wattles on throat.  New Guinea and Northern Australia. Cassowaries.");
        buttonH.setText("Relatively small, with round body and short, stout legs, widely set.  Nostrils on end of bill. Feathers very hair-like.  New Zealand. Kiwis.");
        hideButtons(buttonH);
    }

    private void setsc8 () {
        screen = 8;
        buttonA.setText("Wings are long and narrow and curve back; bill is short. Swifts.");
        buttonB.setText("As in 8a, but with crests and long forked tails. Southeast Asia. Crested Swifts.");
        buttonB.setText("Small; wings are short, with very quick wingbeats; bill is long and slender; plumage often iridescent. Hummingbirds.");
        hideButtons(buttonC);
    }

    private void setsc9 () {
        screen = 9;
        buttonA.setText("Have only 2 front toes.");
        buttonB.setText("Have 3 front toes.");
        hideButtons(buttonB);
    }

    private void setsc10 () {
        screen = 10;
        buttonA.setText("Outer hind toe definitely longer than inner hind toe.");
        buttonB.setText("The outer hind toes is somewhat shorter than the inner hind toe; bill is stout, with feathers around nostrils; plumage is soft, in metallic colors. Found in forests. Trogons.");
        hideButtons(buttonB);
    }

    private void setsc11 () {
        screen = 11;
        buttonA.setText("Bill has a raised area (cere) at top, around nostrils.");
        buttonB.setText("Bill has no cere.");
        hideButtons(buttonB);
    }

    private void setsc12 () {
        screen = 12;
        buttonA.setText("Legs are feathered down to ankle, sometimes to toes; plumage is fluffy; bill is hooked; eyes face front; ruff of feathers around face. Owls.");
        buttonB.setText("Legs not feathered to ankle; body is roundish, heavy; bill is hooked,bottom rounded and strong. Parrot, Parakeets, and Macaws.");
        hideButtons(buttonB);
    }

    private void setsc13 () {
        screen = 13;
        buttonA.setText("Tails are rounded; legs usually do not extend beyond tail; skull is broad. Typical Owls.");
        buttonB.setText("Tails often have irregular edge; legs are long, often extending beyond tail; skull is somewhat narrow, with heart-shaped facial disk. Barn Owls.");
        hideButtons(buttonB);
    }

    private void setsc14 () {
        screen = 14;
        buttonA.setText("Tail is almost always shorter than wing.");
        buttonB.setText("Tail is longer than wing. Cuckoos, Road-Runners, and relatives.");
        hideButtons(buttonB);
    }

    private void setsc15 () {
        screen = 15;
        buttonA.setText("Stout, with short necks, big heads, and large, heavy bill; may have tufts over nostrils; commonly brightly colored. Barbets.");
        buttonB.setText("Small to almost moderate size; body gray to brownish above, lighter underneath, with various markings; bills usually blunt; tails with white patches. Mostly African. Honeyguides.");
        buttonC.setText("Body is lean, brightly colored, with long, tapered tail; bill is long and pointed. Semitropical and Tropical Americas.  Jacamars.");
        buttonD.setText("Body is rounded; neck is short and head is large; bill is heavy and flattened, often hooked at tip, and surrounded by bristles. Tropical Americas. Puffbirds.");
        buttonE.setText("Large, curved, distinctly marked bill. American Tropics. Toucans.");
        buttonF.setText("Straight, hard, pointed bill of moderate size. Legs short; toes long and well-clawed; tail feathers pointed and supportive. Woodpeckers and Flickers");
        hideButtons(buttonF);
    }

    private void setsc16 () {
        screen = 16;
        buttonA.setText("Ankles are flattened and much deeper than wide; feet are webbed. Divers.");
        buttonB.setText("Not as in above.");
        hideButtons(buttonB);
    }

    private void setsc17 () {
        screen = 17;
        buttonA.setText("Toe webbing to toe tips. Legs encased in body to ankle; tail is short; wings are narrow and set well back on body; bill is straight and pointed. Loons.");
        buttonB.setText("Toe webbing not complete, and made of stiff flaps; no functional tail; plumage is soft, thick, and shiny. Grebes.");
        hideButtons(buttonB);
    }

    private void setsc18 () {
        screen = 18;
        buttonA.setText("Bill is hooked, with raised upper area (cere) around nostrils. Day-hunters.");
        buttonB.setText("Bill is usually at least somewhat broad, rarely hooked and lacks cere.");
        hideButtons(buttonB);
    }

    private void setsc19 () {
        screen = 19;
        buttonA.setText("Upper bill usually lacks tooth-like notch; wings usually broad and rounded at tips. Eagles, Hawks, Harriers, and Old World Vultures.");
        buttonB.setText("Toes long, not strongly hooked, and slightly webbed; nostrils are slits. American Vultures.");
        buttonC.setText("Upper bill usually with notch; wings relatively long and pointed; thighs loosely feathered. Falcons and relatives.");
        buttonD.setText("Toes all equal in length, with reversible outer toe and spiked underpads; thighs heavily feathered, legs bare.Ospreys and Fish-Hawks.");
        buttonE.setText("Long crest of quill-like feathers; legs long; hunts on ground for snakes. Secretary Birds.");
        hideButtons(buttonE);
    }

    private void setsc20 () {
        screen = 20;
        buttonA.setText("Bill is made up of thin plates; bill edge is ridged or serrated.");
        buttonB.setText("Bill rarely as in above.");
        hideButtons(buttonB);
    }

    private void setsc21 () {
        screen = 21;
        buttonA.setText("Neck is as long or longer than body; space between nostrils and eyes has no feathers.");
        buttonB.setText("Not as in above.");
        hideButtons(buttonB);
    }

    private void setsc22 () {
        screen = 22;
        buttonA.setText("Tail is rounded.");
        buttonB.setText("Bill is mostly orange, with black node at upper base; tail is wedge-shaped. Mute Swan.");
        hideButtons(buttonB);
    }

    private void setsc23 () {
        screen = 23;
        buttonA.setText("Bill black, with yellow spot at base. Whistling or Tundra Swan.");
        buttonB.setText("Bill is completely black. Trumpeter Swan.");
        hideButtons(buttonB);
    }

    private void setsc24 () {
        screen = 24;
        buttonA.setText("Ankle is longer than middle toe (not counting claw).");
        buttonB.setText("Ankle not as in above.");
        hideButtons(buttonB);
    }

    private void setsc25 () {
        screen = 25;
        buttonA.setText("Bill serrations not visible when bill is closed.");
        buttonB.setText("Bill not as in above.");
        hideButtons(buttonB);
    }

    private void setsc26 () {
        screen = 26;
        buttonA.setText("Cheeks are white. Canada Goose.");
        buttonB.setText("Entire head is black. Brent Goose.");
        hideButtons(buttonB);
    }

    private void setsc27 () {
        screen = 27;
        buttonA.setText("Bill is narrower than deep at base. White-Fronted Geese, Snow Geese.");
        buttonB.setText("Bill is wider than deep at base. Emperor Geese.");
        hideButtons(buttonB);
    }

    private void setsc28 () {
        screen = 28;
        buttonA.setText("Lower bill is serrated.");
        buttonB.setText("Lower bill has ridged plates.");
        hideButtons(buttonB);
    }

    private void setsc29 () {
        screen = 29;
        buttonA.setText("Bill serrations bend toward back.");
        buttonB.setText("Bill serrations are vertical; head and shoulders are black; body is brown above, white below. Hooded Merganser Duck.");
        hideButtons(buttonB);
    }

    private void setsc30 () {
        screen = 30;
        buttonA.setText("With a small crest. Common Merganser.");
        buttonB.setText("With a long thin crest. Red-Breasted Merganser.");
        hideButtons(buttonB);
    }

    private void setsc31 () {
        screen = 31;
        buttonA.setText("Ankle with scaly pattern on front.");
        buttonB.setText("Ankle with network pattern on front. Tree-Ducks.");
        hideButtons(buttonB);
    }

    private void setsc32 () {
        screen = 32;
        buttonA.setText("Hind toe has broad, flat lobe.");
        buttonB.setText("Hind toe not as in above.");
        hideButtons(buttonB);
    }

    private void setsc33 () {
        screen = 33;
        buttonA.setText("Bill flares. Includes Ruddy Duck.");
        buttonB.setText("Eider Ducks.");
        buttonC.setText("Ring-Necked Ducks, Scaups, and relatives.");
        buttonD.setText("Scoters.");
        buttonE.setText("Labrador Duck.");
        buttonF.setText("Goldeneyes, Buffleheads.");
        buttonG.setText("Harlequin Duck.");
        buttonH.setText("Old-Squaw.");
        buttonI.setText("Dipping ducks, 'True' Ducks, including Mallards and Teals.");
        hideButtons(buttonI);
    }

    private void setsc34 () {
        screen = 34;
        buttonA.setText("Bill is broad. Shoveler.");
        buttonB.setText("Bill not as in above. Wood Ducks.");
        hideButtons(buttonB);
    }

    private void setsc35 () {
        screen = 35;
        buttonA.setText("Bill is longer than head; legs are very long; toes spread flat across surface. Waders.");
        buttonB.setText("Not as in above.");
        hideButtons(buttonB);
    }

    private void setsc36 () {
        screen = 36;
        buttonA.setText("Head is fully feathered; bill tip is usually straight; neck commonly held with 'S' curve; middle toe claw with comb-like serrations. Herons, Egrets, and Bitterns.");
        buttonB.setText("Head may lack feathers; neck and middle toe not as in above; hind toe attaches higher than other toes. Storks.");
        buttonC.setText("Bill is long and curved or straight and widened near the tip; middle toe similar to first option, but hind toe like above. Ibises and Spoonbills.");
        buttonD.setText("Neck and legs quite long; toes fully webbed; hind toes like second option above or missing; bill heavy and curved. Flamingoes.");
        hideButtons(buttonD);
    }

    private void setsc37 () {
        screen = 37;
        buttonA.setText("Toes not webbed, with hind toe being strong and as long as the front toes; ankle is longer than the longest front toe; often have bristles at the base of bill. Perching Birds, including Songbirds.");
        buttonB.setText("Plumage is dense, usually waterproof; commonly in whites, blacks, grays and browns; toes long, may or may not be webbed; wings are pointed, with edge feathers much longer than base feathers. Found usually in coastal areas.");
        buttonC.setText("Wings are rounded; necks relatively long; bill commonly long, pointed, and hard; lower part of thigh commonly not feathered. Mostly Marsh Birds.");
        buttonD.setText("Wings are rounded, short, and curved; feet are heavy; thighs are fully feathered; bills are stout and curve downward; feet are heavy; good runners, poor fliers. Game Birds and Fowl.");
        buttonE.setText("Ankles are short; front toes are fused near base. Includes Kingfishers and Hornbills.");
        buttonF.setText("Bill is relatively short, often with bristles at base; nostrils are thin, often with fleshy or horny flap; hind toe small or absent. Includes Pigeons and Doves.");
        hideButtons(buttonF);
    }

    private void setsc38 () {
        screen = 38;
        buttonA.setText("Plumage dull brown, gray, or olive green; beak usually hooked and somewhat flattened; heads are large; crown feathers usually can be lifted in display, often with bright streak; wings usually pointed; tails usually round to shallowly forked. Active insect eaters, Americas. Tyrant Flycatchers.");
        buttonB.setText("Brown back, whitish belly; bill long and pointed; neck somewhat long; tail quite long, with curled outer feathers and wispy inner feathers, used in display. Australia. Lyre Birds.");
        buttonC.setText("Small; color is streaked brown or gray, darker above than below; bill is pointed and curves down slightly; most have crests or head tufts; hind toe has long straight claw; well-known for singing ability. Larks.");
        buttonD.setText("Body is slender; wings long and pointed; tail usually forked; bill is short, triangular; has facial bristles; color often with metallic sheen, darker above than below. Swallows and Martins.");
        buttonE.setText("Moderate to large size; bill is strong, unnotched, with forward-facing bristles over nostrils; ankle is scaled in front but smooth in back; feet are large and strong. Includes crows, ravens, jays, rooks, and jackdaws.");
        buttonF.setText("Notable for the ability to display for courtship; includes the brilliantly marked birds of paradise and stage-building bower birds. Indonesia and Australia.");
        buttonG.setText("Quite small; plumage is soft and thick, usually gray or brown with markings of black, white, blue and/or yellow which is not too bright and is not barred, streaked, or mottled; bill is short, stout, and pointed, with bristles partly concealing nostrils; wings are rounded, with outermost primary feather half the length of the second. Titmice, including Chickadees.");
        buttonH.setText("Small; back is brown with streaks and spots above, belly is whitish; bill is thin and curves downward; tail feathers are long, stiff, and pointed, used as props against trees. Creepers.");
        buttonI.setText("Small and stocky; back is solid gray to bluish, belly is white, sometimes with reddish brown; top of head may be brown or black; bill is thin, straight, and pointed; legs are short but stout; toes are long	and strong with sharp claws; tails are short and blunt. Often climb in head-down position. Nuthatches and relatives.");
        buttonJ.setText("Usually small; brown or brownish gray, with various stripes, streaks, and spots of black, white, gray, or browns; bill is slender and sharp-pointed, usually with slight downcurve; legs are strong; wings are short and rounded; tails are short and generally carried upright. Very vocal. Wrens.");
        buttonK.setText("Moderate size, with slender build; bill usually slender, pointed, and down-curved; tail usually long. Good singers and mimics. Mockingbirds, Catbirds, and Thrashers");
        buttonL.setText("Moderate size; roundish body; ankle usually without scales, or with only lower portion scaled. Quite vocal. Thrushes, including Robins, Bluebirds, Blackbirds, and Nightingales.");
        buttonM.setText("Small; dull in color; bill is thin; legs and feet are weak. Insect eaters and commonly arboreal. Good singers. Old World Warblers");
        buttonN.setText("Small to moderate size; colors are drab, well-blended, and plumage is soft, silky; bill is broad; legs are short. Includes waxwings, silky flycatchers, and relatives.");
        buttonO.setText("Small to moderate size; back is commonly gray or brown, belly white, often with markings on head, wing, and/or tail; head is large and broad; bill is stout, hooked at end and notched at the tip. Predatory. Shrikes.");
        buttonP.setText("Moderate size; usually dark in color, often black with metallic sheen; may have bright markings; often have crests; may have wattle or bare patches on head; bill usually straight, may curve downward; wings are pointed, with outer primary feathers quite short; tail is usually short, often square. Starlings, including talking Mynah Birds.");
        buttonQ.setText("Small; back is olive-green or gray-brown, belly whitish; often have markings, commonly around eyes; bill is somewhat thick, hooked slightly, with small notch near tip. Vocal. Vireos.");
        buttonR.setText("Small and delicate; colors vary through seasons, but commonly marked in yellows or reds; bill is slender, pointed, and has bristles at base; tails are rounded. New World. Wood Warblers and relatives.");
        buttonS.setText("Small to moderate size; colors vary, with yellows common; bill is hard, usually conical and pointed; wings are pointed; legs and feet are strong; tail is rounded. Includes American Blackbirds, Grackles, Orioles, Meadowlarks, Cowbirds, and Bobolinks.");
        buttonT.setText("Small to moderate size; often brightly colored; bill is somewhat short, conical, curved down along top ridge, slightly hooked, with small notch near tip; wings usually short and rounded. Fruit and nectar eaters. Tanagers.");
        buttonU.setText("Small to moderate size; bill is short, conical, and pointed, adapted for eating seeds. New World Seedeaters. Includes Sparrows, Finches, and Cardinals.");
        buttonV.setText("Similar to above, but Old World in origin. Includes goldfinches, Waxbills, and Weaver Finches.");
        hideButtons(buttonV);
    }

    private void setsc39 () {
        screen = 39;
        buttonA.setText("Small to moderate size; body is roundish, marked in bold patterns of browns, black, and white; bill is short and slightly swollen near the tip. Plovers and Lapwings, including Killdeer.");
        buttonB.setText("Small to moderate size; body is marked in browns, grays, and white, but not in very bold patterns; bill is at least as long as head, thin and straight or down-curved. Sandpipers and relatives.");
        buttonC.setText("Moderate to large, with streamlined bodies; commonly marked with white, gray, gray-brown and black; wings are long and pointed and angular; feet are webbed. Gulls and Terns.");
        buttonD.setText("Similar to above, but with fleshy cere around nostrils. Jaegars and Skuas.");
        buttonE.setText("Superficially penguin-like but with feathered wings capable of flight. Auks, Puffins, and relatives.");
        hideButtons(buttonE);
    }

    private void setsc40 () {
        screen = 40;
        buttonA.setText("Small to moderate size; commonly dull in color; body quite narrow; legs are stout; toes are quite long. Rails, Coots, Gallinules.");
        buttonB.setText("Large; have long neck and long legs; head is usually partly bare of feathers; tail is short and wide; wings are wide and long; hind toe attaches high and rarely bears weight. Cranes.");
        buttonC.setText("Large; grayish-brown; head fully feathered; bill is long and powerful; wings are relative small and rounded; hind toe attaches at same level as other toes. American. Limpkins.");
        hideButtons(buttonC);
    }

    private void setsc41 () {
        screen = 41;
        buttonA.setText("Ankle is at least partly feathered; bill is short and curves downward; nostrils are feathered; often have a patch of bare, brightly-colored skin over the eye; hind toe much shorter than others and attached much higher; neck is short, often with inflatable bare spot or erectile feathers. Grouse, including Ptarmigans.");
        buttonB.setText("Moderate to large; ankle rarely feathered; nostrils not feathered; often have spurs on ankle; may be brightly colored. Pheasants, Quail, and Partridges, including Peacocks and domestic Chickens.");
        buttonC.setText("Body curved, with smooth dark feathers and white specks; neck and head is bare; tail quite short. Guineafowl.");
        buttonD.setText("Body is stout, with a relatively thick neck; head and neck is bare; toes have very slight webbing. American Turkeys.");
        buttonE.setText("Brownish, with crest of long stiff feathers; neck is long, head is small, bill is short and stout. Young have 2 claws on wings. South American Rain Forests. Hoatzin.");
        hideButtons(buttonE);
    }

}
