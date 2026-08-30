package defpackage;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zi6  reason: default package */
/* loaded from: classes.dex */
public final class zi6 extends cj6 {
    public final /* synthetic */ int R = 1;
    public final Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi6(vh2 vh2Var, String str) {
        super(vh2Var, str);
        vh2Var.getClass();
        str.getClass();
        this.X = vh2Var.p(str);
    }

    @Override // defpackage.ns5
    public final void M(int i, String str) {
        int i2 = this.R;
        Object obj = this.X;
        switch (i2) {
            case 0:
                str.getClass();
                ((aj6) obj).M(i, str);
                return;
            case 1:
                str.getClass();
                d();
                ((di2) obj).t(i, str);
                return;
            default:
                str.getClass();
                d();
                yf2.T(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.ns5
    public boolean P() {
        switch (this.R) {
            case 0:
                return ((aj6) this.X).P();
            default:
                return super.P();
        }
    }

    @Override // defpackage.ns5
    public final boolean a0() {
        int i = this.R;
        vh2 vh2Var = this.A;
        Object obj = this.X;
        switch (i) {
            case 0:
                aj6 aj6Var = (aj6) obj;
                boolean a0 = aj6Var.a0();
                if (aj6Var.q(0).equalsIgnoreCase("wal")) {
                    vh2Var.A.enableWriteAheadLogging();
                } else {
                    vh2Var.A.disableWriteAheadLogging();
                }
                return a0;
            case 1:
                d();
                ((di2) obj).B.execute();
                return false;
            default:
                int i2 = bj6.a[((yi6) obj).ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    SQLiteDatabase sQLiteDatabase = vh2Var.A;
                                    gh3 gh3Var = vh2.X;
                                    if (((Method) gh3Var.getValue()) != null) {
                                        gh3 gh3Var2 = vh2.R;
                                        if (((Method) gh3Var2.getValue()) != null) {
                                            Method method = (Method) gh3Var.getValue();
                                            method.getClass();
                                            Method method2 = (Method) gh3Var2.getValue();
                                            method2.getClass();
                                            Object invoke = method2.invoke(sQLiteDatabase, null);
                                            if (invoke != null) {
                                                method.invoke(invoke, 0, null, 0, null);
                                            } else {
                                                i.n("Required value was null.");
                                            }
                                        }
                                    }
                                    vh2Var.d();
                                } else {
                                    i.c();
                                }
                            } else {
                                vh2Var.i();
                            }
                        } else {
                            vh2Var.d();
                        }
                    } else {
                        vh2Var.w();
                    }
                } else {
                    vh2Var.I();
                    vh2Var.w();
                }
                return false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        int i = this.R;
        Object obj = this.X;
        switch (i) {
            case 0:
                ((aj6) obj).close();
                return;
            case 1:
                ((di2) obj).close();
                this.L = true;
                return;
            default:
                this.L = true;
                return;
        }
    }

    @Override // defpackage.ns5
    public final void e(int i) {
        int i2 = this.R;
        Object obj = this.X;
        switch (i2) {
            case 0:
                ((aj6) obj).e(i);
                return;
            case 1:
                d();
                ((di2) obj).e(i);
                return;
            default:
                d();
                yf2.T(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.ns5
    public final void g(int i, long j) {
        int i2 = this.R;
        Object obj = this.X;
        switch (i2) {
            case 0:
                ((aj6) obj).g(i, j);
                return;
            case 1:
                d();
                ((di2) obj).g(i, j);
                return;
            default:
                d();
                yf2.T(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.ns5
    public final byte[] getBlob(int i) {
        switch (this.R) {
            case 0:
                return ((aj6) this.X).getBlob(i);
            case 1:
                d();
                yf2.T(21, "no row");
                throw null;
            default:
                d();
                yf2.T(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.ns5
    public final int getColumnCount() {
        switch (this.R) {
            case 0:
                return ((aj6) this.X).getColumnCount();
            case 1:
                d();
                return 0;
            default:
                d();
                return 0;
        }
    }

    @Override // defpackage.ns5
    public final String getColumnName(int i) {
        switch (this.R) {
            case 0:
                return ((aj6) this.X).getColumnName(i);
            case 1:
                d();
                yf2.T(21, "no row");
                throw null;
            default:
                d();
                yf2.T(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.ns5
    public final long getLong(int i) {
        switch (this.R) {
            case 0:
                return ((aj6) this.X).getLong(i);
            case 1:
                d();
                yf2.T(21, "no row");
                throw null;
            default:
                d();
                yf2.T(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.cj6, defpackage.ns5
    public void h() {
        int i = this.R;
        Object obj = this.X;
        switch (i) {
            case 0:
                ((aj6) obj).h();
                return;
            case 1:
                d();
                ((di2) obj).h();
                return;
            default:
                super.h();
                return;
        }
    }

    @Override // defpackage.ns5
    public final boolean isNull(int i) {
        switch (this.R) {
            case 0:
                return ((aj6) this.X).isNull(i);
            case 1:
                d();
                yf2.T(21, "no row");
                throw null;
            default:
                d();
                yf2.T(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.ns5
    public final void j(int i, byte[] bArr) {
        int i2 = this.R;
        Object obj = this.X;
        switch (i2) {
            case 0:
                ((aj6) obj).j(i, bArr);
                return;
            case 1:
                d();
                ((di2) obj).j(i, bArr);
                return;
            default:
                d();
                yf2.T(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.ns5
    public final String q(int i) {
        switch (this.R) {
            case 0:
                return ((aj6) this.X).q(i);
            case 1:
                d();
                yf2.T(21, "no row");
                throw null;
            default:
                d();
                yf2.T(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.cj6, defpackage.ns5
    public void reset() {
        switch (this.R) {
            case 0:
                ((aj6) this.X).reset();
                return;
            default:
                super.reset();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi6(vh2 vh2Var, String str, aj6 aj6Var) {
        super(vh2Var, str);
        vh2Var.getClass();
        str.getClass();
        this.X = aj6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zi6(vh2 vh2Var, String str, yi6 yi6Var) {
        super(vh2Var, str);
        vh2Var.getClass();
        str.getClass();
        this.X = yi6Var;
    }
}
