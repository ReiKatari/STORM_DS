package y;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    public final Object f14643a;

    public j(Object obj) {
        this.f14643a = obj;
    }

    public void a(Surface surface) {
        if (((OutputConfiguration) c()).getSurface() != surface) {
            if (!e()) {
                throw new IllegalStateException("Cannot have 2 surfaces for a non-sharing configuration");
            }
            throw new IllegalArgumentException("Exceeds maximum number of surfaces");
        }
        throw new IllegalStateException("Surface is already added!");
    }

    public void b() {
        ((i) this.f14643a).f14641c = true;
    }

    public Object c() {
        Object obj = this.f14643a;
        p7.m.h(obj instanceof i);
        return ((i) obj).f14639a;
    }

    public String d() {
        return ((i) this.f14643a).f14640b;
    }

    public boolean e() {
        return ((i) this.f14643a).f14641c;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        return this.f14643a.equals(((j) obj).f14643a);
    }

    public void f(long j2) {
        ((i) this.f14643a).f14642d = j2;
    }

    public void h(String str) {
        ((i) this.f14643a).f14640b = str;
    }

    public final int hashCode() {
        return this.f14643a.hashCode();
    }

    public void g(int i2) {
    }

    public void i(long j2) {
    }
}
