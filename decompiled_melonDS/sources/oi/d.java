package oi;

import java.net.URL;
import java.util.ArrayList;
import nc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final long f11024a;

    /* renamed from: b  reason: collision with root package name */
    public final long f11025b;

    /* renamed from: c  reason: collision with root package name */
    public final String f11026c;

    /* renamed from: d  reason: collision with root package name */
    public final c f11027d;

    /* renamed from: e  reason: collision with root package name */
    public final URL f11028e;

    /* renamed from: f  reason: collision with root package name */
    public final ArrayList f11029f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f11030g;

    public d(long j2, long j10, String str, URL url, ArrayList arrayList, ArrayList arrayList2, c cVar) {
        cVar.getClass();
        this.f11024a = j2;
        this.f11025b = j10;
        this.f11026c = str;
        this.f11027d = cVar;
        this.f11028e = url;
        this.f11029f = arrayList;
        this.f11030g = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (this.f11024a == dVar.f11024a && g.a(this.f11025b, dVar.f11025b) && k.a(this.f11026c, dVar.f11026c) && this.f11027d == dVar.f11027d && this.f11028e.equals(dVar.f11028e) && this.f11029f.equals(dVar.f11029f) && this.f11030g.equals(dVar.f11030g)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int f8 = w.d.f(this.f11025b, Long.hashCode(this.f11024a) * 31, 31);
        String str = this.f11026c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode2 = this.f11027d.hashCode();
        int hashCode3 = this.f11028e.hashCode();
        int hashCode4 = this.f11029f.hashCode();
        return this.f11030g.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((f8 + hashCode) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder k10 = kc.a.k("RAAchievementSet(id=", d0.d.j0(this.f11024a), ", gameId=", g.b(this.f11025b), ", title=");
        k10.append(this.f11026c);
        k10.append(", type=");
        k10.append(this.f11027d);
        k10.append(", iconUrl=");
        k10.append(this.f11028e);
        k10.append(", achievements=");
        k10.append(this.f11029f);
        k10.append(", leaderboards=");
        k10.append(this.f11030g);
        k10.append(")");
        return k10.toString();
    }
}
