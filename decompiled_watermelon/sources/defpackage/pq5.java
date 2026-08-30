package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pq5  reason: default package */
/* loaded from: classes.dex */
public final class pq5 {
    public final qo0 a;
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public a31 h;
    public boolean i;
    public boolean q;
    public boolean r;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final rq5 j = rq5.AUTOMATIC;
    public final long k = -1;
    public final e81 l = new e81(7, (byte) 0);
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public final ArrayList o = new ArrayList();
    public boolean p = true;
    public final boolean s = true;

    public pq5(Context context, Class cls, String str) {
        this.a = q75.a(cls);
        this.b = context;
        this.c = str;
    }

    public final void a(py3... py3VarArr) {
        for (py3 py3Var : py3VarArr) {
            Integer valueOf = Integer.valueOf(py3Var.a);
            LinkedHashSet linkedHashSet = this.n;
            linkedHashSet.add(valueOf);
            linkedHashSet.add(Integer.valueOf(py3Var.b));
        }
        py3[] py3VarArr2 = (py3[]) Arrays.copyOf(py3VarArr, py3VarArr.length);
        e81 e81Var = this.l;
        e81Var.getClass();
        for (py3 py3Var2 : py3VarArr2) {
            e81Var.c(py3Var2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x033f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sq5 b() {
        /*
            Method dump skipped, instructions count: 991
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pq5.b():sq5");
    }
}
