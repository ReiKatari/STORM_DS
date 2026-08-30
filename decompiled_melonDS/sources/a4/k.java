package a4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class k extends b3.o {

    /* renamed from: i0  reason: collision with root package name */
    public final int f246i0 = s1.e(this);

    /* renamed from: j0  reason: collision with root package name */
    public b3.o f247j0;

    @Override // b3.o
    public final void E0() {
        super.E0();
        for (b3.o oVar = this.f247j0; oVar != null; oVar = oVar.Y) {
            oVar.N0(this.f1771b0);
            if (!oVar.f1777h0) {
                oVar.E0();
            }
        }
    }

    @Override // b3.o
    public final void F0() {
        for (b3.o oVar = this.f247j0; oVar != null; oVar = oVar.Y) {
            oVar.F0();
        }
        super.F0();
    }

    @Override // b3.o
    public final void J0() {
        super.J0();
        for (b3.o oVar = this.f247j0; oVar != null; oVar = oVar.Y) {
            oVar.J0();
        }
    }

    @Override // b3.o
    public final void K0() {
        for (b3.o oVar = this.f247j0; oVar != null; oVar = oVar.Y) {
            oVar.K0();
        }
        super.K0();
    }

    @Override // b3.o
    public final void L0() {
        super.L0();
        for (b3.o oVar = this.f247j0; oVar != null; oVar = oVar.Y) {
            oVar.L0();
        }
    }

    @Override // b3.o
    public final void M0(b3.o oVar) {
        this.A = oVar;
        for (b3.o oVar2 = this.f247j0; oVar2 != null; oVar2 = oVar2.Y) {
            oVar2.M0(oVar);
        }
    }

    @Override // b3.o
    public final void N0(r1 r1Var) {
        this.f1771b0 = r1Var;
        for (b3.o oVar = this.f247j0; oVar != null; oVar = oVar.Y) {
            oVar.N0(r1Var);
        }
    }

    public final j O0(j jVar) {
        b3.o oVar;
        b3.o oVar2 = ((b3.o) jVar).A;
        b3.o oVar3 = null;
        if (oVar2 != jVar) {
            if (jVar instanceof b3.o) {
                oVar = (b3.o) jVar;
            } else {
                oVar = null;
            }
            if (oVar != null) {
                oVar3 = oVar.X;
            }
            if (oVar2 != this.A || !nc.k.a(oVar3, this)) {
                a0.j.p("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (oVar2.f1777h0) {
                x3.a.c("Cannot delegate to an already attached node");
            }
            oVar2.M0(this.A);
            int i2 = this.L;
            int f8 = s1.f(oVar2);
            oVar2.L = f8;
            int i10 = this.L;
            int i11 = f8 & 2;
            if (i11 != 0 && (i10 & 2) != 0 && !(this instanceof a0)) {
                x3.a.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + oVar2);
            }
            oVar2.Y = this.f247j0;
            this.f247j0 = oVar2;
            oVar2.X = this;
            Q0(f8 | this.L, false);
            if (this.f1777h0) {
                if (i11 != 0 && (i2 & 2) == 0) {
                    n1 n1Var = l.t(this).A0;
                    this.A.N0(null);
                    n1Var.g();
                } else {
                    N0(this.f1771b0);
                }
                oVar2.E0();
                oVar2.K0();
                if (!oVar2.f1777h0) {
                    x3.a.c("autoInvalidateInsertedNode called on unattached node");
                }
                s1.a(oVar2, -1, 1);
            }
        }
        return jVar;
    }

    public final void P0(j jVar) {
        b3.o oVar = null;
        for (b3.o oVar2 = this.f247j0; oVar2 != null; oVar2 = oVar2.Y) {
            if (oVar2 == jVar) {
                boolean z10 = oVar2.f1777h0;
                if (z10) {
                    a1.d0 d0Var = s1.f333a;
                    if (!z10) {
                        x3.a.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    s1.a(oVar2, -1, 2);
                    oVar2.L0();
                    oVar2.F0();
                }
                oVar2.M0(oVar2);
                oVar2.R = 0;
                b3.o oVar3 = oVar2.Y;
                if (oVar == null) {
                    this.f247j0 = oVar3;
                } else {
                    oVar.Y = oVar3;
                }
                oVar2.Y = null;
                oVar2.X = null;
                int i2 = this.L;
                int f8 = s1.f(this);
                Q0(f8, true);
                if (this.f1777h0 && (i2 & 2) != 0 && (f8 & 2) == 0) {
                    n1 n1Var = l.t(this).A0;
                    this.A.N0(null);
                    n1Var.g();
                    return;
                }
                return;
            }
            oVar = oVar2;
        }
        wa.b.e(jVar, "Could not find delegate: ");
    }

    public final void Q0(int i2, boolean z10) {
        int i10;
        b3.o oVar;
        int i11 = this.L;
        this.L = i2;
        if (i11 != i2) {
            b3.o oVar2 = this.A;
            if (oVar2 == this) {
                this.R = i2;
            }
            if (this.f1777h0) {
                b3.o oVar3 = this;
                while (oVar3 != null) {
                    i2 |= oVar3.L;
                    oVar3.L = i2;
                    if (oVar3 == oVar2) {
                        break;
                    }
                    oVar3 = oVar3.X;
                }
                if (z10 && oVar3 == oVar2) {
                    i2 = s1.f(oVar2);
                    oVar2.L = i2;
                }
                if (oVar3 != null && (oVar = oVar3.Y) != null) {
                    i10 = oVar.R;
                } else {
                    i10 = 0;
                }
                int i12 = i2 | i10;
                while (oVar3 != null) {
                    i12 |= oVar3.L;
                    oVar3.R = i12;
                    oVar3 = oVar3.X;
                }
            }
        }
    }
}
