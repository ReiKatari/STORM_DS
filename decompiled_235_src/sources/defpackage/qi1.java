package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import android.util.Range;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qi1  reason: default package */
/* loaded from: classes.dex */
public final class qi1 {
    public final /* synthetic */ int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public Object f;
    public final Object g;
    public final Object h;
    public Object i;

    public qi1(ArrayList arrayList, List list) {
        String str;
        Object obj;
        String concat;
        String str2;
        String str3;
        boolean i;
        this.a = 1;
        list.getClass();
        Object obj2 = yy.h;
        obj2.getClass();
        this.c = list;
        this.d = obj2;
        this.e = du1.A;
        this.f = yt1.A;
        List<di7> k1 = gt0.k1(gt0.o1(arrayList));
        this.g = k1;
        this.h = new hk0(5);
        ov2 x = u24.x();
        x.getClass();
        this.i = x;
        if (!obj2.equals(obj2)) {
            for (di7 di7Var : k1) {
                if (di7Var.f.i(zi7.N)) {
                    i.h("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
                    throw null;
                }
            }
        }
        List list2 = (List) this.f;
        Set set = (Set) this.e;
        if (!set.isEmpty() || !list2.isEmpty()) {
            Set<qu2> set2 = set;
            ArrayList arrayList2 = new ArrayList(ht0.v0(set2, 10));
            for (qu2 qu2Var : set2) {
                arrayList2.add(qu2Var.a());
            }
            for (da2 da2Var : gt0.k1(gt0.o1(arrayList2))) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : set2) {
                    if (((qu2) obj3).a() == da2Var) {
                        arrayList3.add(obj3);
                    }
                }
                if (arrayList3.size() > 1) {
                    u34.w(arrayList3, "requiredFeatures has conflicting feature values: ");
                    throw null;
                }
            }
            list2.getClass();
            if (gt0.k1(gt0.o1(list2)).size() == list2.size()) {
                LinkedHashSet M0 = gt0.M0(set2, list2);
                if (M0.isEmpty()) {
                    for (di7 di7Var2 : (List) this.g) {
                        oj7.Companion.getClass();
                        if (mj7.a(di7Var2) != oj7.UNDEFINED) {
                            if (di7Var2 instanceof p25) {
                                str = "Preview";
                            } else if (di7Var2 instanceof d23) {
                                str = "ImageCapture";
                            } else if (di7Var2 instanceof r13) {
                                str = "ImageAnalysis";
                            } else if (ej2.L(di7Var2)) {
                                str = "VideoCapture";
                            } else {
                                str = "UseCase";
                            }
                            Iterator<E> it = da2.getEntries().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj = it.next();
                                    oj7.Companion.getClass();
                                    int i2 = lj7.b[((da2) obj).ordinal()];
                                    if (i2 != 1) {
                                        if (i2 != 2) {
                                            if (i2 != 3) {
                                                if (i2 != 4) {
                                                    if (i2 == 5) {
                                                        i = nb3.k(di7Var2.f.b(zi7.W, Boolean.TRUE), Boolean.FALSE);
                                                        continue;
                                                    } else {
                                                        i.d();
                                                        throw null;
                                                    }
                                                } else {
                                                    i = di7Var2.f.i(e23.X);
                                                    continue;
                                                }
                                            } else if (!di7Var2.f.i(zi7.U) && !di7Var2.f.i(zi7.V)) {
                                                i = false;
                                                continue;
                                            } else {
                                                i = true;
                                                continue;
                                            }
                                        } else {
                                            i = di7Var2.f.i(zi7.N);
                                            continue;
                                        }
                                    } else {
                                        i = di7Var2.f.i(j23.n);
                                        continue;
                                    }
                                    if (i) {
                                        break;
                                    }
                                } else {
                                    obj = null;
                                    break;
                                }
                            }
                            da2 da2Var2 = (da2) obj;
                            if (da2Var2 != null) {
                                StringBuilder sb = new StringBuilder("A ");
                                sb.append(da2Var2.name());
                                sb.append(" value is set to ");
                                sb.append(str);
                                sb.append(" despite using feature groups. Do not use APIs like ");
                                int[] iArr = qc6.a;
                                int i3 = iArr[da2Var2.ordinal()];
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            if (i3 != 4) {
                                                if (i3 == 5) {
                                                    concat = "Recorder.Builder.setQualitySelector";
                                                } else {
                                                    i.d();
                                                    throw null;
                                                }
                                            } else {
                                                concat = str.concat(".Builder.setOutputFormat");
                                            }
                                        } else if (ej2.L(di7Var2)) {
                                            concat = str.concat(".Builder.setVideoStabilizationEnabled");
                                        } else {
                                            concat = str.concat(".Builder.setPreviewStabilizationEnabled");
                                        }
                                    } else {
                                        concat = str.concat(".Builder.setTargetFrameRateRange");
                                    }
                                } else {
                                    concat = str.concat(".Builder.setDynamicRange");
                                }
                                sb.append(concat);
                                sb.append(" while using feature groups. If, for example, ");
                                int i4 = iArr[da2Var2.ordinal()];
                                if (i4 != 1) {
                                    if (i4 != 2) {
                                        if (i4 != 3) {
                                            if (i4 != 4) {
                                                if (i4 == 5) {
                                                    str2 = "UHD recording quality";
                                                } else {
                                                    i.d();
                                                    throw null;
                                                }
                                            } else {
                                                str2 = "JPEG_R output format";
                                            }
                                        } else {
                                            str2 = "stabilization";
                                        }
                                    } else {
                                        str2 = "60 FPS";
                                    }
                                } else {
                                    str2 = "HDR";
                                }
                                sb.append(str2);
                                sb.append(" is required, instead set ");
                                int i5 = iArr[da2Var2.ordinal()];
                                if (i5 != 1) {
                                    if (i5 != 2) {
                                        if (i5 != 3) {
                                            if (i5 != 4) {
                                                if (i5 != 5) {
                                                    i.d();
                                                    throw null;
                                                }
                                                str3 = "GroupableFeatures.UHD_RECORDING";
                                            } else {
                                                str3 = "GroupableFeature.IMAGE_ULTRA_HDR";
                                            }
                                        } else {
                                            str3 = "GroupableFeature.PREVIEW_STABILIZATION";
                                        }
                                    } else {
                                        str3 = "GroupableFeature.FPS_60";
                                    }
                                } else {
                                    str3 = "GroupableFeature.HDR_HLG10";
                                }
                                i.f(i61.n(sb, str3, " as either a required or preferred feature."));
                                throw null;
                            }
                        } else {
                            e41.f(di7Var2, " is not supported with feature group");
                            throw null;
                        }
                    }
                } else {
                    u34.w(M0, "requiredFeatures and preferredFeatures have duplicate values: ");
                    throw null;
                }
            } else {
                e41.j("Duplicate values in preferredFeatures(", 41, list2);
                throw null;
            }
        }
        this.b = true;
    }

    public FileInputStream a(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                ((t35) this.d).h();
                return null;
            }
            return null;
        }
    }

    public void b(int i, Serializable serializable) {
        ((Executor) this.c).execute(new xd0(this, i, 3, serializable));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + ((List) this.g) + ", frameRateRange=" + ((Range) this.d) + ", requiredFeatureGroup=" + ((Set) this.e) + ", preferredFeatureGroup=" + ((List) this.f) + ", effects=" + ((List) this.c) + ", viewPort=null}";
            default:
                return super.toString();
        }
    }

    public qi1(AssetManager assetManager, Executor executor, t35 t35Var, String str, File file) {
        byte[] bArr;
        this.a = 0;
        this.b = false;
        this.c = executor;
        this.d = t35Var;
        this.h = str;
        this.g = file;
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            bArr = f04.x;
        } else {
            switch (i) {
                case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                case 25:
                    bArr = f04.B;
                    break;
                case SubAllocator.N4 /* 26 */:
                    bArr = f04.A;
                    break;
                case 27:
                    bArr = f04.z;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = f04.y;
                    break;
                default:
                    bArr = null;
                    break;
            }
        }
        this.e = bArr;
    }
}
