package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g60  reason: default package */
/* loaded from: classes.dex */
public final class g60 extends z0 {
    public final /* synthetic */ int L = 1;
    public final Object R;

    public g60(Object[] objArr, int i, int i2) {
        super(i, i2);
        this.R = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        int i = this.L;
        Object obj = this.R;
        switch (i) {
            case 0:
                if (hasNext()) {
                    int i2 = this.A;
                    this.A = i2 + 1;
                    return ((Object[]) obj)[i2];
                }
                vd6.b();
                return null;
            default:
                if (hasNext()) {
                    this.A++;
                    return obj;
                }
                vd6.b();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        int i = this.L;
        Object obj = this.R;
        switch (i) {
            case 0:
                if (hasPrevious()) {
                    int i2 = this.A - 1;
                    this.A = i2;
                    return ((Object[]) obj)[i2];
                }
                vd6.b();
                return null;
            default:
                if (hasPrevious()) {
                    this.A--;
                    return obj;
                }
                vd6.b();
                return null;
        }
    }

    public g60(int i, Object obj) {
        super(i, 1);
        this.R = obj;
    }
}
