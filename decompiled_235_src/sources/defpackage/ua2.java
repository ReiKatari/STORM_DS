package defpackage;

import android.webkit.MimeTypeMap;
import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ua2  reason: default package */
/* loaded from: classes.dex */
public final class ua2 implements la2 {
    public final File a;

    public ua2(File file) {
        this.a = file;
    }

    @Override // defpackage.la2
    public final Object a(r41 r41Var) {
        String str = lt4.B;
        File file = this.a;
        return new mn6(new xa2(w31.q(file), db2.A, null, null), MimeTypeMap.getSingleton().getMimeTypeFromExtension(jc2.y0(file)), zb1.DISK);
    }
}
