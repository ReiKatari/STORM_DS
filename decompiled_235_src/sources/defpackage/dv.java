package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dv  reason: default package */
/* loaded from: classes.dex */
public final class dv implements Iterable, zf3 {
    public final /* synthetic */ int A;
    public final Object B;

    public /* synthetic */ dv(Object obj, int i) {
        this.A = i;
        this.B = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.A;
        Object obj = this.B;
        switch (i) {
            case 0:
                return new w0((Object[]) obj);
            case 1:
                return new w0((float[]) obj, 1);
            case 2:
                return new op1((Iterator) ((on2) obj).c());
            case 3:
                return new kh1((lh1) obj);
            case 4:
                return new w0((wb6) obj);
            default:
                return new w0((s52) obj);
        }
    }
}
