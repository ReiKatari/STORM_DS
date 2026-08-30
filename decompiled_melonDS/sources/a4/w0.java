package a4;

import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w0 implements y3.w0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f352a;

    /* renamed from: b  reason: collision with root package name */
    public final int f353b;

    /* renamed from: c  reason: collision with root package name */
    public final int f354c;

    /* renamed from: d  reason: collision with root package name */
    public final Map f355d;

    /* renamed from: e  reason: collision with root package name */
    public final mc.l f356e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ mc.l f357f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ y3.x0 f358g;

    public /* synthetic */ w0(int i2, int i10, Map map, mc.l lVar, mc.l lVar2, y3.x0 x0Var, int i11) {
        this.f352a = i11;
        this.f353b = i2;
        this.f354c = i10;
        this.f355d = map;
        this.f356e = lVar;
        this.f357f = lVar2;
        this.f358g = x0Var;
    }

    @Override // y3.w0
    public final int a() {
        switch (this.f352a) {
            case 0:
                return this.f354c;
            default:
                return this.f354c;
        }
    }

    @Override // y3.w0
    public final void b() {
        switch (this.f352a) {
            case 0:
                this.f357f.k(((x0) this.f358g).f363f0);
                return;
            default:
                this.f357f.k(((y3.h) this.f358g).A.f363f0);
                return;
        }
    }

    @Override // y3.w0
    public final int c() {
        switch (this.f352a) {
            case 0:
                return this.f353b;
            default:
                return this.f353b;
        }
    }

    @Override // y3.w0
    public final Map d() {
        switch (this.f352a) {
            case 0:
                return this.f355d;
            default:
                return this.f355d;
        }
    }

    @Override // y3.w0
    public final mc.l e() {
        switch (this.f352a) {
            case 0:
                return this.f356e;
            default:
                return this.f356e;
        }
    }
}
