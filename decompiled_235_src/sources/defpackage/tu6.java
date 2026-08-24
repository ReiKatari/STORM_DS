package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tu6  reason: default package */
/* loaded from: classes.dex */
public final class tu6 extends wu6 {
    public final /* synthetic */ int R = 1;
    public final Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu6(vm2 vm2Var, String str) {
        super(vm2Var, str);
        vm2Var.getClass();
        str.getClass();
        this.X = vm2Var.k(str);
    }

    @Override // defpackage.j36
    public final String R(int i) {
        switch (this.R) {
            case 0:
                return ((uu6) this.X).R(i);
            case 1:
                e();
                ii2.T(21, "no row");
                throw null;
            default:
                e();
                ii2.T(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.j36
    public final void c(int i, long j) {
        int i2 = this.R;
        Object obj = this.X;
        switch (i2) {
            case 0:
                ((uu6) obj).c(i, j);
                return;
            case 1:
                e();
                ((dn2) obj).c(i, j);
                return;
            default:
                e();
                ii2.T(25, "column index out of range");
                throw null;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.R;
        Object obj = this.X;
        switch (i) {
            case 0:
                ((uu6) obj).close();
                return;
            case 1:
                ((dn2) obj).close();
                this.L = true;
                return;
            default:
                this.L = true;
                return;
        }
    }

    @Override // defpackage.j36
    public final void d(byte[] bArr, int i) {
        int i2 = this.R;
        Object obj = this.X;
        switch (i2) {
            case 0:
                ((uu6) obj).d(bArr, i);
                return;
            case 1:
                e();
                ((dn2) obj).d(bArr, i);
                return;
            default:
                e();
                ii2.T(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.j36
    public final void f(int i) {
        int i2 = this.R;
        Object obj = this.X;
        switch (i2) {
            case 0:
                ((uu6) obj).f(i);
                return;
            case 1:
                e();
                ((dn2) obj).f(i);
                return;
            default:
                e();
                ii2.T(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.j36
    public final boolean f0() {
        int i = this.R;
        vm2 vm2Var = this.A;
        Object obj = this.X;
        switch (i) {
            case 0:
                uu6 uu6Var = (uu6) obj;
                boolean f0 = uu6Var.f0();
                if (uu6Var.R(0).equalsIgnoreCase("wal")) {
                    vm2Var.A.enableWriteAheadLogging();
                } else {
                    vm2Var.A.disableWriteAheadLogging();
                }
                return f0;
            case 1:
                e();
                ((dn2) obj).B.execute();
                return false;
            default:
                int i2 = vu6.a[((su6) obj).ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    SQLiteDatabase sQLiteDatabase = vm2Var.A;
                                    go3 go3Var = vm2.X;
                                    if (((Method) go3Var.getValue()) != null) {
                                        go3 go3Var2 = vm2.R;
                                        if (((Method) go3Var2.getValue()) != null) {
                                            Method method = (Method) go3Var.getValue();
                                            method.getClass();
                                            Method method2 = (Method) go3Var2.getValue();
                                            method2.getClass();
                                            Object invoke = method2.invoke(sQLiteDatabase, null);
                                            if (invoke != null) {
                                                method.invoke(invoke, 0, null, 0, null);
                                            } else {
                                                i.m("Required value was null.");
                                            }
                                        }
                                    }
                                    vm2Var.e();
                                } else {
                                    i.d();
                                }
                            } else {
                                vm2Var.h();
                            }
                        } else {
                            vm2Var.e();
                        }
                    } else {
                        vm2Var.n();
                    }
                } else {
                    vm2Var.D();
                    vm2Var.n();
                }
                return false;
        }
    }

    @Override // defpackage.wu6, defpackage.j36
    public void g() {
        int i = this.R;
        Object obj = this.X;
        switch (i) {
            case 0:
                ((uu6) obj).g();
                return;
            case 1:
                e();
                ((dn2) obj).g();
                return;
            default:
                super.g();
                return;
        }
    }

    @Override // defpackage.j36
    public final byte[] getBlob(int i) {
        switch (this.R) {
            case 0:
                return ((uu6) this.X).getBlob(i);
            case 1:
                e();
                ii2.T(21, "no row");
                throw null;
            default:
                e();
                ii2.T(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.j36
    public final int getColumnCount() {
        switch (this.R) {
            case 0:
                return ((uu6) this.X).getColumnCount();
            case 1:
                e();
                return 0;
            default:
                e();
                return 0;
        }
    }

    @Override // defpackage.j36
    public final String getColumnName(int i) {
        switch (this.R) {
            case 0:
                return ((uu6) this.X).getColumnName(i);
            case 1:
                e();
                ii2.T(21, "no row");
                throw null;
            default:
                e();
                ii2.T(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.j36
    public final long getLong(int i) {
        switch (this.R) {
            case 0:
                return ((uu6) this.X).getLong(i);
            case 1:
                e();
                ii2.T(21, "no row");
                throw null;
            default:
                e();
                ii2.T(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.j36
    public final boolean isNull(int i) {
        switch (this.R) {
            case 0:
                return ((uu6) this.X).isNull(i);
            case 1:
                e();
                ii2.T(21, "no row");
                throw null;
            default:
                e();
                ii2.T(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.wu6, defpackage.j36
    public void reset() {
        switch (this.R) {
            case 0:
                ((uu6) this.X).reset();
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // defpackage.j36
    public final void w(int i, String str) {
        int i2 = this.R;
        Object obj = this.X;
        switch (i2) {
            case 0:
                str.getClass();
                ((uu6) obj).w(i, str);
                return;
            case 1:
                str.getClass();
                e();
                ((dn2) obj).m(i, str);
                return;
            default:
                str.getClass();
                e();
                ii2.T(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.j36
    public boolean z() {
        switch (this.R) {
            case 0:
                return ((uu6) this.X).z();
            default:
                return super.z();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu6(vm2 vm2Var, String str, uu6 uu6Var) {
        super(vm2Var, str);
        vm2Var.getClass();
        str.getClass();
        this.X = uu6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu6(vm2 vm2Var, String str, su6 su6Var) {
        super(vm2Var, str);
        vm2Var.getClass();
        str.getClass();
        this.X = su6Var;
    }
}
