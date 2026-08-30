package defpackage;

import java.io.File;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i46  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class i46 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ File B;

    public /* synthetic */ i46(File file, int i) {
        this.A = i;
        this.B = file;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
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
                return q72.L(file2);
            default:
                File file3 = new File(file, str);
                if (!file3.isFile()) {
                    file3 = null;
                }
                if (file3 == null) {
                    return null;
                }
                return q72.L(file3);
        }
    }
}
