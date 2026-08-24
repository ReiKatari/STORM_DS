package defpackage;

import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju4  reason: default package */
/* loaded from: classes.dex */
public abstract class ju4 {
    public static final OpenOption[] a;

    static {
        OpenOption[] openOptionArr = new OpenOption[2];
        StandardOpenOption.CREATE;
        StandardOpenOption.TRUNCATE_EXISTING;
        OpenOption[] openOptionArr2 = new OpenOption[2];
        StandardOpenOption.CREATE;
        StandardOpenOption.APPEND;
        CopyOption[] copyOptionArr = new CopyOption[0];
        FileAttribute[] fileAttributeArr = new FileAttribute[0];
        FileVisitOption[] fileVisitOptionArr = new FileVisitOption[0];
        LinkOption[] linkOptionArr = new LinkOption[0];
        LinkOption[] linkOptionArr2 = new LinkOption[1];
        LinkOption.NOFOLLOW_LINKS;
        a = new OpenOption[0];
        Path[] pathArr = new Path[0];
    }
}
