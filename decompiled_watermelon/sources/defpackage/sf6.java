package defpackage;

import android.util.Size;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sf6  reason: default package */
/* loaded from: classes.dex */
public final class sf6 {
    public final int a;
    public final Size b;
    public final int c;
    public final String d;
    public final og4 e;
    public final ng4 f;
    public final pg4 g;
    public final sn1 h;
    public final qg4 i;
    public bg0 j;

    public sf6(int i, int i2, sn1 sn1Var, ng4 ng4Var, og4 og4Var, pg4 pg4Var, qg4 qg4Var, Size size, String str) {
        size.getClass();
        str.getClass();
        this.a = i;
        this.b = size;
        this.c = i2;
        this.d = str;
        this.e = og4Var;
        this.f = ng4Var;
        this.g = pg4Var;
        this.h = sn1Var;
        this.i = qg4Var;
    }

    public final boolean a() {
        qg4 qg4Var;
        pg4 pg4Var = this.g;
        if (pg4Var != null) {
            long j = pg4Var.a;
            if (!pg4.a(j, 0L) && !pg4.a(j, 1L) && !pg4.a(j, 3L) && (qg4Var = this.i) != null) {
                long j2 = qg4Var.a;
                if (!qg4.a(j2, 0L) && !qg4.a(j2, 1L)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final String toString() {
        return wh1.g(this.a, "Output-");
    }
}
