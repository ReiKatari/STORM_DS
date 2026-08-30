package jc;

import a6.a1;
import a6.f0;
import d1.x1;
import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import m9.o;
import me.magnum.melonds.common.camera.DSiCameraSource;
import u1.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements Iterator, oc.a {
    public final /* synthetic */ int A;
    public int B;
    public Object L;
    public Object R;
    public final /* synthetic */ uc.f X;

    public f(h hVar) {
        this.A = 0;
        this.X = hVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.R = arrayDeque;
        File file = (File) hVar.f7805b;
        if (file.isDirectory()) {
            arrayDeque.push(c(file));
        } else if (file.isFile()) {
            arrayDeque.push(new g(file));
        } else {
            this.B = 2;
        }
    }

    public void a() {
        h hVar = (h) this.X;
        Iterator it = (Iterator) this.L;
        while (it.hasNext()) {
            Object next = it.next();
            if (!((Boolean) ((h1) hVar.f7806c).k(next)).booleanValue()) {
                this.R = next;
                this.B = 1;
                return;
            }
        }
        this.B = 0;
    }

    public void b() {
        Iterator it = (Iterator) this.L;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((uc.j) this.X).f13548c.k(next)).booleanValue()) {
                this.B = 1;
                this.R = next;
                return;
            }
        }
        this.B = 0;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [jc.g, jc.a] */
    /* JADX WARN: Type inference failed for: r0v7, types: [jc.g, jc.a] */
    public a c(File file) {
        int i2 = e.f7802a[((i) ((h) this.X).f7806c).ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                return new g(file);
            }
            o.o();
            return null;
        }
        return new g(file);
    }

    public boolean d() {
        h hVar = (h) this.X;
        Iterator it = (Iterator) this.L;
        Iterator it2 = (Iterator) this.R;
        if (it2 != null && it2.hasNext()) {
            this.B = 1;
            return true;
        }
        while (it.hasNext()) {
            Iterator it3 = (Iterator) uc.i.f13545b0.k(((x1) hVar.f7806c).k(it.next()));
            if (it3.hasNext()) {
                this.R = it3;
                this.B = 1;
                return true;
            }
        }
        this.B = 2;
        this.R = null;
        return false;
    }

    public boolean e() {
        File file;
        File a10;
        this.B = 3;
        ArrayDeque arrayDeque = (ArrayDeque) this.R;
        while (true) {
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                file = null;
                break;
            }
            a10 = gVar.a();
            if (a10 == null) {
                arrayDeque.pop();
            } else if (a10.equals(gVar.f7803a) || !a10.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
                break;
            } else {
                arrayDeque.push(c(a10));
            }
        }
        file = a10;
        if (file != null) {
            this.L = file;
            this.B = 1;
        } else {
            this.B = 2;
        }
        if (this.B == 1) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                int i2 = this.B;
                if (i2 != 0) {
                    if (i2 == 1) {
                        return true;
                    }
                    if (i2 != 2) {
                        a0.j.h("hasNext called when the iterator is in the FAILED state.");
                    }
                    return false;
                }
                return e();
            case DSiCameraSource.FrontCamera /* 1 */:
                if (this.B == -1) {
                    a();
                }
                if (this.B == 1) {
                    return true;
                }
                return false;
            case 2:
                int i10 = this.B;
                if (i10 == 1) {
                    return true;
                }
                if (i10 == 2) {
                    return false;
                }
                return d();
            default:
                if (this.B == -1) {
                    b();
                }
                if (this.B == 1) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                int i2 = this.B;
                if (i2 == 1) {
                    this.B = 0;
                    return (File) this.L;
                } else if (i2 != 2 && e()) {
                    this.B = 0;
                    return (File) this.L;
                } else {
                    fj.j.l();
                    return null;
                }
            case DSiCameraSource.FrontCamera /* 1 */:
                if (this.B == -1) {
                    a();
                }
                if (this.B != 0) {
                    Object obj = this.R;
                    this.R = null;
                    this.B = -1;
                    return obj;
                }
                fj.j.l();
                return null;
            case 2:
                int i10 = this.B;
                if (i10 != 2) {
                    if (i10 == 0 && !d()) {
                        fj.j.l();
                    } else {
                        this.B = 0;
                        Iterator it = (Iterator) this.R;
                        it.getClass();
                        return it.next();
                    }
                } else {
                    fj.j.l();
                }
                return null;
            default:
                if (this.B == -1) {
                    b();
                }
                if (this.B != 0) {
                    Object obj2 = this.R;
                    this.R = null;
                    this.B = -1;
                    return obj2;
                }
                fj.j.l();
                return null;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case DSiCameraSource.FrontCamera /* 1 */:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f(h hVar, byte b10) {
        this.A = 1;
        this.X = hVar;
        this.L = new f0((uc.j) hVar.f7805b);
        this.B = -1;
    }

    public f(h hVar, char c4) {
        this.A = 2;
        this.X = hVar;
        this.L = ((a1) hVar.f7805b).iterator();
    }

    public f(uc.j jVar) {
        this.A = 3;
        this.X = jVar;
        this.L = jVar.f13547b.iterator();
        this.B = -1;
    }
}
