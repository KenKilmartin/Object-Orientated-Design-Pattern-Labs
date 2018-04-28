


import java.awt.*;

public class FolderFactory {
    Folder unSelected, Selected;
    public FolderFactory() {
//        Color brown = new Color(0x5f5f1c);
        Selected =  new Folder(Color.red);
        unSelected = new Folder(Color.green);
    }

    public Folder getFolder(boolean isSelected) {
        if (isSelected)
            return Selected;
        else
            return unSelected;
    }
}
