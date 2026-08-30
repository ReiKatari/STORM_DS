package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimeZone;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zf1  reason: default package */
/* loaded from: classes.dex */
public final class zf1 {
    public final String a;
    public final long[] b;
    public final ArrayList c;
    public final ArrayList d;
    public boolean e;
    public boolean f;
    public xf1 g;
    public int h;
    public long i;
    public final /* synthetic */ gg1 j;

    public zf1(gg1 gg1Var, String str) {
        str.getClass();
        this.j = gg1Var;
        this.a = str;
        gg1Var.getClass();
        this.b = new long[2];
        this.c = new ArrayList();
        this.d = new ArrayList();
        StringBuilder sb = new StringBuilder(str);
        sb.append('.');
        int length = sb.length();
        for (int i = 0; i < 2; i++) {
            sb.append(i);
            this.c.add(this.j.A.d(sb.toString()));
            sb.append(".tmp");
            this.d.add(this.j.A.d(sb.toString()));
            sb.setLength(length);
        }
    }

    public final bg1 a() {
        TimeZone timeZone = ik7.a;
        if (this.e) {
            gg1 gg1Var = this.j;
            if (gg1Var.g0 || (this.g == null && !this.f)) {
                ArrayList arrayList = new ArrayList();
                long[] jArr = (long[]) this.b.clone();
                int i = 0;
                for (int i2 = 0; i2 < 2; i2++) {
                    try {
                        sb6 N = gg1Var.B.N((jk4) this.c.get(i2));
                        if (!gg1Var.g0) {
                            this.h++;
                            N = new yf1(N, gg1Var, this);
                        }
                        arrayList.add(N);
                    } catch (FileNotFoundException unused) {
                        int size = arrayList.size();
                        while (i < size) {
                            Object obj = arrayList.get(i);
                            i++;
                            gk7.b((sb6) obj);
                        }
                        try {
                            gg1Var.J(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new bg1(this.j, this.a, this.i, arrayList, jArr);
            }
            return null;
        }
        return null;
    }
}
