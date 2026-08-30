package m9;

import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends k {

    /* renamed from: a  reason: collision with root package name */
    public final Drawable f9381a;

    /* renamed from: b  reason: collision with root package name */
    public final j f9382b;

    /* renamed from: c  reason: collision with root package name */
    public final Throwable f9383c;

    public e(Drawable drawable, j jVar, Throwable th2) {
        this.f9381a = drawable;
        this.f9382b = jVar;
        this.f9383c = th2;
    }

    @Override // m9.k
    public final Drawable a() {
        return this.f9381a;
    }

    @Override // m9.k
    public final j b() {
        return this.f9382b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e) {
                e eVar = (e) obj;
                if (nc.k.a(this.f9381a, eVar.f9381a) && nc.k.a(this.f9382b, eVar.f9382b) && this.f9383c.equals(eVar.f9383c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i2;
        Drawable drawable = this.f9381a;
        if (drawable != null) {
            i2 = drawable.hashCode();
        } else {
            i2 = 0;
        }
        int hashCode = this.f9382b.hashCode();
        return this.f9383c.hashCode() + ((hashCode + (i2 * 31)) * 31);
    }
}
