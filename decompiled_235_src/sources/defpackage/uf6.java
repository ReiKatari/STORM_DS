package defpackage;

import java.io.File;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uf6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class uf6 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ File B;

    public /* synthetic */ uf6(File file, int i) {
        this.A = i;
        this.B = file;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        File file = this.B;
        String str = (String) obj;
        switch (i) {
            case 0:
                str.getClass();
                File file2 = new File(file, str);
                if (!file2.isFile()) {
                    file2 = null;
                }
                if (file2 == null) {
                    return null;
                }
                return jc2.B0(file2);
            default:
                File file3 = new File(file, str);
                if (!file3.isFile()) {
                    file3 = null;
                }
                if (file3 == null) {
                    return null;
                }
                return jc2.B0(file3);
        }
    }
}
