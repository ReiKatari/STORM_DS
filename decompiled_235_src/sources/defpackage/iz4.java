package defpackage;

import java.util.concurrent.locks.ReentrantLock;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iz4  reason: default package */
/* loaded from: classes.dex */
public final class iz4 {
    public final int a;
    public final on2 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final b01[] f;
    public final lb6 g;
    public final pu h;

    /* JADX WARN: Type inference failed for: r2v4, types: [lb6, kb6] */
    public iz4(int i, on2 on2Var) {
        this.a = i;
        this.b = on2Var;
        this.f = new b01[i];
        int i2 = mb6.a;
        this.g = new kb6(i);
        this.h = new pu(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[Catch: all -> 0x007a, TryCatch #2 {all -> 0x0078, blocks: (B:17:0x003e, B:27:0x0074, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:25:0x0054, B:26:0x006e, B:33:0x007c, B:34:0x0083), top: B:39:0x003e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #2 {all -> 0x0078, blocks: (B:17:0x003e, B:27:0x0074, B:18:0x0043, B:20:0x0047, B:22:0x004d, B:25:0x0054, B:26:0x006e, B:33:0x007c, B:34:0x0083), top: B:39:0x003e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(s41 s41Var) {
        gz4 gz4Var;
        int i;
        lb6 lb6Var;
        pu puVar = this.h;
        try {
            if (s41Var instanceof gz4) {
                gz4Var = (gz4) s41Var;
                int i2 = gz4Var.Y;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    gz4Var.Y = i2 - Integer.MIN_VALUE;
                    Object obj = gz4Var.R;
                    x61 x61Var = x61.COROUTINE_SUSPENDED;
                    i = gz4Var.Y;
                    lb6Var = this.g;
                    if (i == 0) {
                        if (i == 1) {
                            oi2.Y(obj);
                        } else {
                            i.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        oi2.Y(obj);
                        gz4Var.Y = 1;
                        if (lb6Var.a(gz4Var) == x61Var) {
                            return x61Var;
                        }
                    }
                    ReentrantLock reentrantLock = this.c;
                    reentrantLock.lock();
                    if (this.e) {
                        if (puVar.isEmpty() && this.d < this.a) {
                            b01 b01Var = new b01((e36) this.b.c());
                            b01[] b01VarArr = this.f;
                            int i3 = this.d;
                            this.d = i3 + 1;
                            b01VarArr[i3] = b01Var;
                            puVar.addLast(b01Var);
                        }
                        b01 b01Var2 = (b01) puVar.removeLast();
                        reentrantLock.unlock();
                        return b01Var2;
                    }
                    ii2.T(21, "Connection pool is closed");
                    throw null;
                }
            }
            ReentrantLock reentrantLock2 = this.c;
            reentrantLock2.lock();
            if (this.e) {
            }
        } catch (Throwable th) {
            lb6Var.c();
            throw th;
        }
        gz4Var = new gz4(this, s41Var);
        Object obj2 = gz4Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = gz4Var.Y;
        lb6Var = this.g;
        if (i == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:10|11)|12|13|14|(1:(1:33)(2:30|(1:32)))(1:16)|17|18|19|20|(1:22)(10:24|12|13|14|(0)(0)|17|18|19|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005f, code lost:
        r2 = r11;
        r11 = r12;
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
        r2 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006f A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:29:0x006b, B:31:0x006f, B:35:0x0077, B:39:0x007e), top: B:44:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0075  */
    /* JADX WARN: Type inference failed for: r12v4, types: [dh5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11, types: [on2] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0058 -> B:24:0x005a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0066 -> B:44:0x006b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, sz0 sz0Var, s41 s41Var) {
        hz4 hz4Var;
        int i;
        dh5 dh5Var;
        hz4 hz4Var2;
        Throwable th;
        u12 u12Var;
        sz0 sz0Var2;
        if (s41Var instanceof hz4) {
            hz4Var = (hz4) s41Var;
            int i2 = hz4Var.e0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hz4Var.e0 = i2 - Integer.MIN_VALUE;
                Object obj = hz4Var.Z;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = hz4Var.e0;
                if (i == 0) {
                    if (i == 1) {
                        j = hz4Var.R;
                        dh5 dh5Var2 = hz4Var.Y;
                        ?? r2 = hz4Var.X;
                        try {
                            try {
                                oi2.Y(obj);
                                sz0Var2 = r2;
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                Throwable th4 = th3;
                                dh5Var = dh5Var2;
                                sz0Var = r2;
                                hz4Var2 = hz4Var;
                                th = th4;
                                if (th instanceof c67) {
                                }
                                hz4Var = hz4Var2;
                                ?? obj2 = new Object();
                                u12Var = new u12((Object) obj2, this, (r41) null, 22);
                                hz4Var.X = sz0Var;
                                hz4Var.Y = obj2;
                                hz4Var.R = j;
                                hz4Var.e0 = 1;
                                if (xk2.M(q60.Y(j), u12Var, hz4Var) == x61Var) {
                                }
                            }
                            if (th instanceof c67) {
                                sz0Var.c();
                            } else if (th == null) {
                                Object obj3 = dh5Var.A;
                                if (obj3 != null) {
                                    return obj3;
                                }
                            } else {
                                throw th;
                            }
                            hz4Var = hz4Var2;
                            ?? obj22 = new Object();
                            u12Var = new u12((Object) obj22, this, (r41) null, 22);
                            hz4Var.X = sz0Var;
                            hz4Var.Y = obj22;
                            hz4Var.R = j;
                            hz4Var.e0 = 1;
                            if (xk2.M(q60.Y(j), u12Var, hz4Var) == x61Var) {
                                return x61Var;
                            }
                            sz0Var2 = sz0Var;
                            dh5Var2 = obj22;
                            dh5Var = dh5Var2;
                            sz0Var = sz0Var2;
                            hz4Var2 = hz4Var;
                            th = null;
                            if (th instanceof c67) {
                            }
                            hz4Var = hz4Var2;
                            ?? obj222 = new Object();
                            u12Var = new u12((Object) obj222, this, (r41) null, 22);
                            hz4Var.X = sz0Var;
                            hz4Var.Y = obj222;
                            hz4Var.R = j;
                            hz4Var.e0 = 1;
                            if (xk2.M(q60.Y(j), u12Var, hz4Var) == x61Var) {
                            }
                        } catch (Throwable th5) {
                            b01 b01Var = (b01) dh5Var.A;
                            if (b01Var != null) {
                                e(b01Var);
                            }
                            throw th5;
                        }
                        dh5Var = dh5Var2;
                        sz0Var = sz0Var2;
                        hz4Var2 = hz4Var;
                        th = null;
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ?? obj2222 = new Object();
                    u12Var = new u12((Object) obj2222, this, (r41) null, 22);
                    hz4Var.X = sz0Var;
                    hz4Var.Y = obj2222;
                    hz4Var.R = j;
                    hz4Var.e0 = 1;
                    if (xk2.M(q60.Y(j), u12Var, hz4Var) == x61Var) {
                    }
                }
            }
        }
        hz4Var = new hz4(this, s41Var);
        Object obj4 = hz4Var.Z;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = hz4Var.e0;
        if (i == 0) {
        }
    }

    public final void c() {
        b01[] b01VarArr;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (b01 b01Var : this.f) {
                if (b01Var != null) {
                    b01Var.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        b01[] b01VarArr;
        String str;
        pu puVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            kw3 I = hf.I();
            int i = puVar.L;
            for (int i2 = 0; i2 < i; i2++) {
                I.add(puVar.get(i2));
            }
            kw3 A = hf.A(I);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("permits=");
            lb6 lb6Var = this.g;
            lb6Var.getClass();
            sb2.append(Math.max(kb6.Z.get(lb6Var), 0));
            sb2.append(", ");
            sb.append(sb2.toString());
            sb.append("queue=(size=" + A.a() + ")[" + gt0.P0(A, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            int i3 = 0;
            for (b01 b01Var : this.f) {
                i3++;
                StringBuilder sb3 = new StringBuilder();
                sb3.append("\t\t[");
                sb3.append(i3);
                sb3.append("] - ");
                if (b01Var != null) {
                    str = b01Var.A.toString();
                } else {
                    str = null;
                }
                sb3.append(str);
                sb.append(sb3.toString());
                sb.append('\n');
                if (b01Var != null) {
                    b01Var.k(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(b01 b01Var) {
        b01Var.getClass();
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(b01Var);
            reentrantLock.unlock();
            this.g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
