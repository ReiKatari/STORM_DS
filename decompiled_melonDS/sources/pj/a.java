package pj;

import java.nio.file.CopyOption;
import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public static final OpenOption[] f11852a;

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
        f11852a = new OpenOption[0];
        Path[] pathArr = new Path[0];
    }
}
