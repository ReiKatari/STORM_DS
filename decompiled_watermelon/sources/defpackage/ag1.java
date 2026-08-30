package defpackage;

import java.io.IOException;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ag1  reason: default package */
/* loaded from: classes.dex */
public final class ag1 {
    public final String a;
    public final long[] b = new long[2];
    public final ArrayList c = new ArrayList(2);
    public final ArrayList d = new ArrayList(2);
    public boolean e;
    public boolean f;
    public xf1 g;
    public int h;
    public final /* synthetic */ hg1 i;

    public ag1(hg1 hg1Var, String str) {
        this.i = hg1Var;
        this.a = str;
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.i.A.d(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.i.A.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final cg1 a() {
        if (!this.e || this.g != null || this.f) {
            return null;
        }
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            hg1 hg1Var = this.i;
            if (i < size) {
                if (!hg1Var.k0.C((jk4) arrayList.get(i))) {
                    try {
                        hg1Var.F(this);
                    } catch (IOException unused) {
                    }
                    return null;
                }
                i++;
            } else {
                this.h++;
                return new cg1(hg1Var, this);
            }
        }
    }
}
