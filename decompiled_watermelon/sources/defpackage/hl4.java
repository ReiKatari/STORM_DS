package defpackage;

import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hl4  reason: default package */
/* loaded from: classes.dex */
public abstract class hl4 {
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
