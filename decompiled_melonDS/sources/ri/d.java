package ri;

import fj.g0;
import fj.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.TimeZone;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final String f12749a;

    /* renamed from: b  reason: collision with root package name */
    public final long[] f12750b;

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f12751c;

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f12752d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f12753e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f12754f;

    /* renamed from: g  reason: collision with root package name */
    public e9.a f12755g;

    /* renamed from: h  reason: collision with root package name */
    public int f12756h;

    /* renamed from: i  reason: collision with root package name */
    public long f12757i;

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ h f12758j;

    public d(h hVar, String str) {
        str.getClass();
        this.f12758j = hVar;
        this.f12749a = str;
        hVar.getClass();
        this.f12750b = new long[2];
        this.f12751c = new ArrayList();
        this.f12752d = new ArrayList();
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append('.');
        int length = sb2.length();
        for (int i2 = 0; i2 < 2; i2++) {
            sb2.append(i2);
            this.f12751c.add(this.f12758j.A.d(sb2.toString()));
            sb2.append(".tmp");
            this.f12752d.add(this.f12758j.A.d(sb2.toString()));
            sb2.setLength(length);
        }
    }

    public final e a() {
        TimeZone timeZone = qi.g.f12552a;
        if (this.f12753e) {
            h hVar = this.f12758j;
            if (hVar.f12769f0 || (this.f12755g == null && !this.f12754f)) {
                ArrayList arrayList = new ArrayList();
                long[] jArr = (long[]) this.f12750b.clone();
                int i2 = 0;
                for (int i10 = 0; i10 < 2; i10++) {
                    try {
                        g0 J = hVar.B.J((x) this.f12751c.get(i10));
                        if (!hVar.f12769f0) {
                            this.f12756h++;
                            J = new c(J, hVar, this);
                        }
                        arrayList.add(J);
                    } catch (FileNotFoundException unused) {
                        int size = arrayList.size();
                        while (i2 < size) {
                            Object obj = arrayList.get(i2);
                            i2++;
                            qi.e.b((g0) obj);
                        }
                        try {
                            hVar.H(this);
                            return null;
                        } catch (IOException unused2) {
                            return null;
                        }
                    }
                }
                return new e(this.f12758j, this.f12749a, this.f12757i, arrayList, jArr);
            }
            return null;
        }
        return null;
    }
}
