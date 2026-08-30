package m9;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9429a;

    /* renamed from: b  reason: collision with root package name */
    public final Bitmap.Config f9430b;

    /* renamed from: c  reason: collision with root package name */
    public final ColorSpace f9431c;

    /* renamed from: d  reason: collision with root package name */
    public final n9.g f9432d;

    /* renamed from: e  reason: collision with root package name */
    public final n9.f f9433e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f9434f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f9435g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f9436h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9437i;

    /* renamed from: j  reason: collision with root package name */
    public final pi.q f9438j;

    /* renamed from: k  reason: collision with root package name */
    public final r f9439k;

    /* renamed from: l  reason: collision with root package name */
    public final p f9440l;
    public final b m;

    /* renamed from: n  reason: collision with root package name */
    public final b f9441n;

    /* renamed from: o  reason: collision with root package name */
    public final b f9442o;

    public n(Context context, Bitmap.Config config, ColorSpace colorSpace, n9.g gVar, n9.f fVar, boolean z10, boolean z11, boolean z12, String str, pi.q qVar, r rVar, p pVar, b bVar, b bVar2, b bVar3) {
        this.f9429a = context;
        this.f9430b = config;
        this.f9431c = colorSpace;
        this.f9432d = gVar;
        this.f9433e = fVar;
        this.f9434f = z10;
        this.f9435g = z11;
        this.f9436h = z12;
        this.f9437i = str;
        this.f9438j = qVar;
        this.f9439k = rVar;
        this.f9440l = pVar;
        this.m = bVar;
        this.f9441n = bVar2;
        this.f9442o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (nc.k.a(this.f9429a, nVar.f9429a) && this.f9430b == nVar.f9430b) {
                if ((Build.VERSION.SDK_INT < 26 || nc.k.a(this.f9431c, nVar.f9431c)) && nc.k.a(this.f9432d, nVar.f9432d) && this.f9433e == nVar.f9433e && this.f9434f == nVar.f9434f && this.f9435g == nVar.f9435g && this.f9436h == nVar.f9436h && nc.k.a(this.f9437i, nVar.f9437i) && nc.k.a(this.f9438j, nVar.f9438j) && nc.k.a(this.f9439k, nVar.f9439k) && nc.k.a(this.f9440l, nVar.f9440l) && this.m == nVar.m && this.f9441n == nVar.f9441n && this.f9442o == nVar.f9442o) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int hashCode = (this.f9430b.hashCode() + (this.f9429a.hashCode() * 31)) * 31;
        ColorSpace colorSpace = this.f9431c;
        int i10 = 0;
        if (colorSpace != null) {
            i2 = colorSpace.hashCode();
        } else {
            i2 = 0;
        }
        int e6 = w.d.e(w.d.e(w.d.e((this.f9433e.hashCode() + ((this.f9432d.hashCode() + ((hashCode + i2) * 31)) * 31)) * 31, this.f9434f, 31), this.f9435g, 31), this.f9436h, 31);
        String str = this.f9437i;
        if (str != null) {
            i10 = str.hashCode();
        }
        int hashCode2 = this.f9439k.f9451a.hashCode();
        int hashCode3 = this.f9440l.A.hashCode();
        int hashCode4 = this.m.hashCode();
        return this.f9442o.hashCode() + ((this.f9441n.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((((e6 + i10) * 31) + Arrays.hashCode(this.f9438j.A)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
