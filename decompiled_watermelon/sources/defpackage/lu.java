package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lu  reason: default package */
/* loaded from: classes.dex */
public final class lu implements Iterable, f93 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ lu(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return new v0((Object[]) obj);
            case 1:
                return new v0(1, (float[]) obj);
            case 2:
                return new hl1((Iterator) ((ki2) obj).c());
            case 3:
                return new id1((jd1) obj);
            case 4:
                return new v0((h06) obj);
            default:
                return new v0((d12) obj);
        }
    }
}
