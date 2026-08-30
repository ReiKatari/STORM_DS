package w7;

import android.database.sqlite.SQLiteDatabase;
import java.lang.reflect.Method;
import m9.o;
import me.magnum.melonds.common.camera.DSiCameraSource;
import v7.j;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends g {
    public final /* synthetic */ int R = 1;
    public final Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v7.b bVar, String str) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.X = bVar.m(str);
    }

    @Override // t7.c
    public final void C(int i2, String str) {
        switch (this.R) {
            case 0:
                str.getClass();
                ((e) this.X).C(i2, str);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                str.getClass();
                d();
                ((j) this.X).r(i2, str);
                return;
            default:
                str.getClass();
                d();
                k.L(25, "column index out of range");
                throw null;
        }
    }

    @Override // t7.c
    public boolean E() {
        switch (this.R) {
            case 0:
                return ((e) this.X).E();
            default:
                return super.E();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [yb.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [yb.f, java.lang.Object] */
    @Override // t7.c
    public final boolean N() {
        switch (this.R) {
            case 0:
                e eVar = (e) this.X;
                boolean N = eVar.N();
                boolean equalsIgnoreCase = eVar.n(0).equalsIgnoreCase("wal");
                v7.b bVar = this.A;
                if (equalsIgnoreCase) {
                    bVar.A.enableWriteAheadLogging();
                } else {
                    bVar.A.disableWriteAheadLogging();
                }
                return N;
            case DSiCameraSource.FrontCamera /* 1 */:
                d();
                ((j) this.X).B.execute();
                return false;
            default:
                int i2 = f.f14167a[((c) this.X).ordinal()];
                v7.b bVar2 = this.A;
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    SQLiteDatabase sQLiteDatabase = bVar2.A;
                                    ?? r32 = v7.b.X;
                                    if (((Method) r32.getValue()) != null) {
                                        ?? r42 = v7.b.R;
                                        if (((Method) r42.getValue()) != null) {
                                            Method method = (Method) r32.getValue();
                                            method.getClass();
                                            Method method2 = (Method) r42.getValue();
                                            method2.getClass();
                                            Object invoke = method2.invoke(sQLiteDatabase, null);
                                            if (invoke != null) {
                                                method.invoke(invoke, 0, null, 0, null);
                                                return false;
                                            }
                                            a0.j.p("Required value was null.");
                                            return false;
                                        }
                                    }
                                    bVar2.d();
                                    return false;
                                }
                                o.o();
                                return false;
                            }
                            bVar2.i();
                            return false;
                        }
                        bVar2.d();
                        return false;
                    }
                    bVar2.t();
                    return false;
                }
                bVar2.F();
                bVar2.t();
                return false;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        switch (this.R) {
            case 0:
                ((e) this.X).close();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((j) this.X).close();
                this.L = true;
                return;
            default:
                this.L = true;
                return;
        }
    }

    @Override // t7.c
    public final void e(int i2) {
        switch (this.R) {
            case 0:
                ((e) this.X).e(i2);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                d();
                ((j) this.X).e(i2);
                return;
            default:
                d();
                k.L(25, "column index out of range");
                throw null;
        }
    }

    @Override // t7.c
    public final void g(int i2, long j2) {
        switch (this.R) {
            case 0:
                ((e) this.X).g(i2, j2);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                d();
                ((j) this.X).g(i2, j2);
                return;
            default:
                d();
                k.L(25, "column index out of range");
                throw null;
        }
    }

    @Override // t7.c
    public final byte[] getBlob(int i2) {
        switch (this.R) {
            case 0:
                return ((e) this.X).getBlob(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                d();
                k.L(21, "no row");
                throw null;
            default:
                d();
                k.L(21, "no row");
                throw null;
        }
    }

    @Override // t7.c
    public final int getColumnCount() {
        switch (this.R) {
            case 0:
                return ((e) this.X).getColumnCount();
            case DSiCameraSource.FrontCamera /* 1 */:
                d();
                return 0;
            default:
                d();
                return 0;
        }
    }

    @Override // t7.c
    public final String getColumnName(int i2) {
        switch (this.R) {
            case 0:
                return ((e) this.X).getColumnName(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                d();
                k.L(21, "no row");
                throw null;
            default:
                d();
                k.L(21, "no row");
                throw null;
        }
    }

    @Override // t7.c
    public final long getLong(int i2) {
        switch (this.R) {
            case 0:
                return ((e) this.X).getLong(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                d();
                k.L(21, "no row");
                throw null;
            default:
                d();
                k.L(21, "no row");
                throw null;
        }
    }

    @Override // w7.g, t7.c
    public void h() {
        switch (this.R) {
            case 0:
                ((e) this.X).h();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                d();
                ((j) this.X).h();
                return;
            default:
                super.h();
                return;
        }
    }

    @Override // t7.c
    public final boolean isNull(int i2) {
        switch (this.R) {
            case 0:
                return ((e) this.X).isNull(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                d();
                k.L(21, "no row");
                throw null;
            default:
                d();
                k.L(21, "no row");
                throw null;
        }
    }

    @Override // t7.c
    public final void j(int i2, byte[] bArr) {
        switch (this.R) {
            case 0:
                ((e) this.X).j(i2, bArr);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                d();
                ((j) this.X).j(i2, bArr);
                return;
            default:
                d();
                k.L(25, "column index out of range");
                throw null;
        }
    }

    @Override // t7.c
    public final String n(int i2) {
        switch (this.R) {
            case 0:
                return ((e) this.X).n(i2);
            case DSiCameraSource.FrontCamera /* 1 */:
                d();
                k.L(21, "no row");
                throw null;
            default:
                d();
                k.L(21, "no row");
                throw null;
        }
    }

    @Override // w7.g, t7.c
    public void reset() {
        switch (this.R) {
            case 0:
                ((e) this.X).reset();
                return;
            default:
                super.reset();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v7.b bVar, String str, e eVar) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.X = eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(v7.b bVar, String str, c cVar) {
        super(bVar, str);
        bVar.getClass();
        str.getClass();
        this.X = cVar;
    }
}
