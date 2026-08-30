package a6;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class v1 {

    /* renamed from: a  reason: collision with root package name */
    public final i2 f517a;

    /* renamed from: b  reason: collision with root package name */
    public q5.b[] f518b;

    public v1() {
        this(new i2());
    }

    public final void a() {
        q5.b[] bVarArr = this.f518b;
        if (bVarArr != null) {
            q5.b bVar = bVarArr[0];
            q5.b bVar2 = bVarArr[1];
            i2 i2Var = this.f517a;
            if (bVar2 == null) {
                bVar2 = i2Var.f479a.f(2);
            }
            if (bVar == null) {
                bVar = i2Var.f479a.f(1);
            }
            g(q5.b.a(bVar, bVar2));
            q5.b bVar3 = this.f518b[a.a.I(16)];
            if (bVar3 != null) {
                f(bVar3);
            }
            q5.b bVar4 = this.f518b[a.a.I(32)];
            if (bVar4 != null) {
                d(bVar4);
            }
            q5.b bVar5 = this.f518b[a.a.I(64)];
            if (bVar5 != null) {
                h(bVar5);
            }
        }
    }

    public abstract i2 b();

    public void c(int i2, q5.b bVar) {
        if (this.f518b == null) {
            this.f518b = new q5.b[10];
        }
        for (int i10 = 1; i10 <= 512; i10 <<= 1) {
            if ((i2 & i10) != 0) {
                this.f518b[a.a.I(i10)] = bVar;
            }
        }
    }

    public abstract void e(q5.b bVar);

    public abstract void g(q5.b bVar);

    public v1(i2 i2Var) {
        this.f517a = i2Var;
    }

    public void d(q5.b bVar) {
    }

    public void f(q5.b bVar) {
    }

    public void h(q5.b bVar) {
    }
}
