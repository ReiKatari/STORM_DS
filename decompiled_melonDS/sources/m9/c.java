package m9;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final zc.q f9363a;

    /* renamed from: b  reason: collision with root package name */
    public final zc.q f9364b;

    /* renamed from: c  reason: collision with root package name */
    public final zc.q f9365c;

    /* renamed from: d  reason: collision with root package name */
    public final zc.q f9366d;

    /* renamed from: e  reason: collision with root package name */
    public final p9.e f9367e;

    /* renamed from: f  reason: collision with root package name */
    public final n9.d f9368f;

    /* renamed from: g  reason: collision with root package name */
    public final Bitmap.Config f9369g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9370h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f9371i;

    /* renamed from: j  reason: collision with root package name */
    public final Drawable f9372j;

    /* renamed from: k  reason: collision with root package name */
    public final Drawable f9373k;

    /* renamed from: l  reason: collision with root package name */
    public final Drawable f9374l;
    public final b m;

    /* renamed from: n  reason: collision with root package name */
    public final b f9375n;

    /* renamed from: o  reason: collision with root package name */
    public final b f9376o;

    public c(zc.q qVar, zc.q qVar2, zc.q qVar3, zc.q qVar4, p9.e eVar, n9.d dVar, Bitmap.Config config, boolean z10, boolean z11, Drawable drawable, Drawable drawable2, Drawable drawable3, b bVar, b bVar2, b bVar3) {
        this.f9363a = qVar;
        this.f9364b = qVar2;
        this.f9365c = qVar3;
        this.f9366d = qVar4;
        this.f9367e = eVar;
        this.f9368f = dVar;
        this.f9369g = config;
        this.f9370h = z10;
        this.f9371i = z11;
        this.f9372j = drawable;
        this.f9373k = drawable2;
        this.f9374l = drawable3;
        this.m = bVar;
        this.f9375n = bVar2;
        this.f9376o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (nc.k.a(this.f9363a, cVar.f9363a) && nc.k.a(this.f9364b, cVar.f9364b) && nc.k.a(this.f9365c, cVar.f9365c) && nc.k.a(this.f9366d, cVar.f9366d) && nc.k.a(this.f9367e, cVar.f9367e) && this.f9368f == cVar.f9368f && this.f9369g == cVar.f9369g && this.f9370h == cVar.f9370h && this.f9371i == cVar.f9371i && nc.k.a(this.f9372j, cVar.f9372j) && nc.k.a(this.f9373k, cVar.f9373k) && nc.k.a(this.f9374l, cVar.f9374l) && this.m == cVar.m && this.f9375n == cVar.f9375n && this.f9376o == cVar.f9376o) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i10;
        int hashCode = this.f9364b.hashCode();
        int hashCode2 = this.f9365c.hashCode();
        int hashCode3 = this.f9366d.hashCode();
        int hashCode4 = this.f9367e.hashCode();
        int e6 = w.d.e(w.d.e((this.f9369g.hashCode() + ((this.f9368f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.f9363a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, this.f9370h, 31), this.f9371i, 31);
        int i11 = 0;
        Drawable drawable = this.f9372j;
        if (drawable != null) {
            i2 = drawable.hashCode();
        } else {
            i2 = 0;
        }
        int i12 = (e6 + i2) * 31;
        Drawable drawable2 = this.f9373k;
        if (drawable2 != null) {
            i10 = drawable2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        Drawable drawable3 = this.f9374l;
        if (drawable3 != null) {
            i11 = drawable3.hashCode();
        }
        int hashCode5 = this.m.hashCode();
        return this.f9376o.hashCode() + ((this.f9375n.hashCode() + ((hashCode5 + ((i13 + i11) * 31)) * 31)) * 31);
    }
}
