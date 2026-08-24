package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fk1  reason: default package */
/* loaded from: classes.dex */
public final class fk1 implements Closeable {
    public final String A;
    public final long B;
    public final ArrayList L;
    public final /* synthetic */ kk1 R;

    public fk1(kk1 kk1Var, String str, long j, ArrayList arrayList, long[] jArr) {
        str.getClass();
        jArr.getClass();
        this.R = kk1Var;
        this.A = str;
        this.B = j;
        this.L = arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.L;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            yy7.b((in6) obj);
        }
    }
}
