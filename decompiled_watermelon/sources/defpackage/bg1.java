package defpackage;

import java.io.Closeable;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bg1  reason: default package */
/* loaded from: classes.dex */
public final class bg1 implements Closeable {
    public final String A;
    public final long B;
    public final ArrayList L;
    public final /* synthetic */ gg1 R;

    public bg1(gg1 gg1Var, String str, long j, ArrayList arrayList, long[] jArr) {
        str.getClass();
        jArr.getClass();
        this.R = gg1Var;
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
            gk7.b((sb6) obj);
        }
    }
}
