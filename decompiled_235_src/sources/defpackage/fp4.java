package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp4  reason: default package */
/* loaded from: classes.dex */
public final class fp4 implements AutoCloseable {
    public final ip4 A;
    public final Object B;
    public boolean L;
    public long R;
    public long X;
    public long Y;
    public long Z;
    public long d0;
    public final ArrayList e0;
    public final LinkedHashMap f0;

    public fp4(ip4 ip4Var) {
        ip4Var.getClass();
        this.A = ip4Var;
        this.B = new Object();
        this.R = 1L;
        this.X = Long.MIN_VALUE;
        this.Y = Long.MIN_VALUE;
        this.Z = Long.MIN_VALUE;
        this.d0 = Long.MIN_VALUE;
        this.e0 = new ArrayList();
        this.f0 = new LinkedHashMap();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.B) {
            if (this.L) {
                return;
            }
            this.L = true;
            ArrayList m1 = gt0.m1(this.f0.values());
            this.f0.clear();
            ArrayList m12 = gt0.m1(this.e0);
            this.e0.clear();
            int size = m1.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = m1.get(i2);
                i2++;
                Object obj2 = ((kp4) obj).a;
            }
            int size2 = m12.size();
            while (i < size2) {
                Object obj3 = m12.get(i);
                i++;
                ep4 ep4Var = (ep4) obj3;
                ep4Var.getClass();
                ep4Var.a(-1L, new mp4(11));
            }
        }
    }

    public final void e(long j) {
        boolean z;
        synchronized (this.B) {
            try {
                if (this.L) {
                    return;
                }
                this.Z = j;
                ArrayList arrayList = this.e0;
                int size = arrayList.size();
                ep4 ep4Var = null;
                boolean z2 = false;
                int i = 0;
                Object obj = null;
                while (true) {
                    if (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (((ep4) obj2).b == j) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (z2) {
                                break;
                            }
                            obj = obj2;
                            z2 = true;
                        }
                    } else if (!z2) {
                    }
                }
                obj = null;
                ep4 ep4Var2 = (ep4) obj;
                if (ep4Var2 != null) {
                    this.d0 = ep4Var2.e;
                    this.e0.remove(ep4Var2);
                    ep4Var = ep4Var2;
                }
                if (ep4Var != null) {
                    ep4Var.a(-1L, new mp4(10));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
        r0 = r1.size();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
        if (r10 >= r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
        r2 = r1.get(r10);
        r10 = r10 + 1;
        r2 = (defpackage.ep4) r2;
        r2.getClass();
        r2.a(-1, new defpackage.mp4(12));
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void h(long j, Object obj) {
        Object kp4Var;
        ArrayList arrayList;
        Object obj2;
        synchronized (this.B) {
            try {
                int i = 0;
                if (!this.L && !this.A.a(this.d0, j)) {
                    ArrayList arrayList2 = this.e0;
                    int size = arrayList2.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size) {
                            obj2 = arrayList2.get(i2);
                            i2++;
                            if (this.A.a(((ep4) obj2).e, j)) {
                                break;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                    ep4 ep4Var = (ep4) obj2;
                    if (ep4Var != null) {
                        arrayList = n(ep4Var.d, ep4Var.e, ep4Var.a);
                        ep4Var.a(j, obj);
                        this.e0.remove(ep4Var);
                        kp4Var = null;
                    } else {
                        this.f0.put(Long.valueOf(j), new kp4(obj));
                        if (this.f0.size() > 3) {
                            kp4Var = this.f0.remove(Long.valueOf(((Number) gt0.G0(this.f0.keySet())).longValue()));
                            arrayList = null;
                        } else {
                            kp4Var = null;
                            arrayList = null;
                        }
                    }
                }
                kp4Var = new kp4(obj);
                arrayList = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        kp4 kp4Var2 = (kp4) kp4Var;
        if (kp4Var2 != null) {
            Object obj3 = kp4Var2.a;
            if ((obj3 instanceof mp4) || obj3 != null) {
            }
        }
    }

    /*  JADX ERROR: IF instruction can be used only in fallback mode
        jadx.core.utils.exceptions.CodegenException: IF instruction can be used only in fallback mode
        	at jadx.core.codegen.InsnGen.fallbackOnlyInsn(InsnGen.java:686)
        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:544)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:302)
        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:272)
        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:175)
        	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:137)
        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:302)
        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
        	at jadx.core.codegen.RegionGen.makeSynchronizedRegion(RegionGen.java:240)
        	at jadx.core.dex.regions.SynchronizedRegion.generate(SynchronizedRegion.java:44)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.dex.regions.Region.generate(Region.java:35)
        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:296)
        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:275)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:377)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:268)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:257)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:241)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:132)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:95)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:77)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:383)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:331)
        */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:23:0x008e, B:25:0x0092, B:27:0x0098, B:30:0x00a0, B:35:0x00ab, B:38:0x00b1, B:43:0x00bc, B:49:0x00c6, B:50:0x00d2, B:52:0x00d8, B:56:0x00ed, B:58:0x00f1, B:59:0x0101, B:61:0x0114, B:62:0x0120, B:64:0x0126, B:68:0x013b, B:70:0x013f), top: B:98:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f1 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:23:0x008e, B:25:0x0092, B:27:0x0098, B:30:0x00a0, B:35:0x00ab, B:38:0x00b1, B:43:0x00bc, B:49:0x00c6, B:50:0x00d2, B:52:0x00d8, B:56:0x00ed, B:58:0x00f1, B:59:0x0101, B:61:0x0114, B:62:0x0120, B:64:0x0126, B:68:0x013b, B:70:0x013f), top: B:98:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0101 A[Catch: all -> 0x00ae, TryCatch #1 {all -> 0x00ae, blocks: (B:23:0x008e, B:25:0x0092, B:27:0x0098, B:30:0x00a0, B:35:0x00ab, B:38:0x00b1, B:43:0x00bc, B:49:0x00c6, B:50:0x00d2, B:52:0x00d8, B:56:0x00ed, B:58:0x00f1, B:59:0x0101, B:61:0x0114, B:62:0x0120, B:64:0x0126, B:68:0x013b, B:70:0x013f), top: B:98:0x008e }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(long r19, long r21, long r23, defpackage.dp4 r25) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fp4.k(long, long, long, dp4):void");
    }

    public final ArrayList n(long j, long j2, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.e0;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            ep4 ep4Var = (ep4) obj;
            if (ep4Var.a == z && ep4Var.d < j && ep4Var.e < j2) {
                arrayList.add(obj);
            }
        }
        arrayList2.removeAll(arrayList);
        return arrayList;
    }
}
