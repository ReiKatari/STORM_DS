package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l80  reason: default package */
/* loaded from: classes.dex */
public final class l80 extends a1 {
    public final /* synthetic */ int L = 1;
    public final Object R;

    public l80(Object[] objArr, int i, int i2) {
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
                fa6.c();
                return null;
            default:
                if (hasNext()) {
                    this.A++;
                    return obj;
                }
                fa6.c();
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
                fa6.c();
                return null;
            default:
                if (hasPrevious()) {
                    this.A--;
                    return obj;
                }
                fa6.c();
                return null;
        }
    }

    public l80(Object obj, int i) {
        super(i, 1);
        this.R = obj;
    }
}
