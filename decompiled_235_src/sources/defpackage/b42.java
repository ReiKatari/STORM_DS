package defpackage;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.compat.quirk.InvalidVideoProfilesQuirk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b42  reason: default package */
/* loaded from: classes.dex */
public final class b42 implements a42 {
    public final String b;
    public final y65 c;
    public final boolean d;
    public final int e;
    public final LinkedHashMap f;

    public b42(String str, y65 y65Var) {
        boolean z;
        int i;
        y65Var.getClass();
        this.b = str;
        this.c = y65Var;
        this.f = new LinkedHashMap();
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            kj2.f0("EncoderProfilesProviderAdapter", "Camera id is not an integer:  " + this.b + ", unable to create EncoderProfilesProviderAdapter.");
            z = false;
            i = -1;
        }
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.a42
    public final boolean a(int i) {
        if (!this.d || b(i) == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:10|(6:12|(2:45|(1:47)(6:48|49|(1:51)(1:(1:53)(2:54|55))|(4:16|(2:40|(2:42|(3:20|(1:(2:23|(2:24|(2:26|(2:28|29))(1:30))))(2:32|(1:(2:34|(2:37|38)(1:36))(1:39)))|31)))|18|(0))|43|44))|14|(0)|43|44)|59|60|(14:62|(1:64)|65|66|68|69|(2:71|(1:(1:74)(1:75)))(1:89)|76|77|79|80|(0)|43|44)|14|(0)|43|44) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0088, code lost:
        defpackage.kj2.g0("EncoderProfilesProviderAdapter", "Unable to get CamcorderProfile by quality: " + r22, r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017c  */
    @Override // defpackage.a42
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ey b(int i) {
        String str;
        int i2;
        String str2;
        ey a;
        boolean contains;
        ey eyVar = null;
        if (this.d) {
            int i3 = this.e;
            if (CamcorderProfile.hasProfile(i3, i)) {
                Integer valueOf = Integer.valueOf(i);
                LinkedHashMap linkedHashMap = this.f;
                if (linkedHashMap.containsKey(valueOf)) {
                    return (ey) linkedHashMap.get(Integer.valueOf(i));
                }
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 31) {
                    EncoderProfiles c = up.c(i, this.b);
                    if (c != null) {
                        if (si1.a().b(InvalidVideoProfilesQuirk.class) != null) {
                            kj2.t("EncoderProfilesProviderAdapter", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
                        } else {
                            try {
                                if (i4 >= 33) {
                                    a = r2.a(c);
                                } else if (i4 >= 31) {
                                    a = up.b(c);
                                } else {
                                    throw new RuntimeException("Unable to call from(EncoderProfiles) on API " + i4 + ". Version 31 or higher required.");
                                }
                            } catch (NullPointerException e) {
                                kj2.g0("EncoderProfilesProviderAdapter", "Failed to create EncoderProfilesProxy, EncoderProfiles might contain invalid video profiles. Use CamcorderProfile instead.", e);
                            }
                            if (a != null) {
                                CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.c.b(CamcorderProfileResolutionQuirk.class);
                                if (camcorderProfileResolutionQuirk != null) {
                                    List list = a.d;
                                    list.getClass();
                                    if (!list.isEmpty()) {
                                        fy fyVar = (fy) list.get(0);
                                        List k1 = gt0.k1((List) camcorderProfileResolutionQuirk.b.getValue());
                                        fyVar.getClass();
                                        contains = k1.contains(new Size(fyVar.e, fyVar.f));
                                        if (!contains) {
                                            List list2 = a42.a;
                                            if (i != 0) {
                                                if (i == 1) {
                                                    Iterator it = list2.iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            Integer num = (Integer) it.next();
                                                            num.getClass();
                                                            ey b = b(num.intValue());
                                                            if (b != null) {
                                                                eyVar = b;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                list2.getClass();
                                                int size = list2.size() - 1;
                                                while (true) {
                                                    if (-1 < size) {
                                                        Object obj = list2.get(size);
                                                        obj.getClass();
                                                        ey b2 = b(((Number) obj).intValue());
                                                        if (b2 != null) {
                                                            eyVar = b2;
                                                        } else {
                                                            size--;
                                                        }
                                                    }
                                                }
                                            }
                                            a = eyVar;
                                        }
                                    }
                                }
                                contains = true;
                                if (!contains) {
                                }
                            }
                            linkedHashMap.put(Integer.valueOf(i), a);
                            return a;
                        }
                    }
                    a = null;
                    if (a != null) {
                    }
                    linkedHashMap.put(Integer.valueOf(i), a);
                    return a;
                }
                CamcorderProfile camcorderProfile = CamcorderProfile.get(i3, i);
                if (camcorderProfile != null) {
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 31) {
                        kj2.f0("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i5 + "instead. CamcorderProfile is deprecated on API 31.");
                    }
                    int i6 = camcorderProfile.duration;
                    int i7 = camcorderProfile.fileFormat;
                    ArrayList arrayList = new ArrayList();
                    int i8 = camcorderProfile.audioCodec;
                    switch (i8) {
                        case 1:
                            str = "audio/3gpp";
                            break;
                        case 2:
                            str = "audio/amr-wb";
                            break;
                        case 3:
                        case 4:
                        case 5:
                            str = "audio/mp4a-latm";
                            break;
                        case 6:
                            str = "audio/vorbis";
                            break;
                        case 7:
                            str = "audio/opus";
                            break;
                        default:
                            str = "audio/none";
                            break;
                    }
                    String str3 = str;
                    int i9 = camcorderProfile.audioBitRate;
                    int i10 = camcorderProfile.audioSampleRate;
                    int i11 = camcorderProfile.audioChannels;
                    if (i8 != 3) {
                        i2 = 5;
                        if (i8 != 4) {
                            if (i8 != 5) {
                                i2 = -1;
                            } else {
                                i2 = 39;
                            }
                        }
                    } else {
                        i2 = 2;
                    }
                    arrayList.add(new dy(i8, str3, i9, i10, i11, i2));
                    ArrayList arrayList2 = new ArrayList();
                    int i12 = camcorderProfile.videoCodec;
                    switch (i12) {
                        case 1:
                            str2 = "video/3gpp";
                            break;
                        case 2:
                            str2 = "video/avc";
                            break;
                        case 3:
                            str2 = "video/mp4v-es";
                            break;
                        case 4:
                            str2 = "video/x-vnd.on2.vp8";
                            break;
                        case 5:
                            str2 = "video/hevc";
                            break;
                        case 6:
                            str2 = "video/x-vnd.on2.vp9";
                            break;
                        case 7:
                            str2 = "video/dolby-vision";
                            break;
                        case 8:
                            str2 = "video/av01";
                            break;
                        default:
                            str2 = "video/none";
                            break;
                    }
                    arrayList2.add(new fy(i12, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                    a = ey.a(i6, i7, arrayList, arrayList2);
                    if (a != null) {
                    }
                    linkedHashMap.put(Integer.valueOf(i), a);
                    return a;
                }
                a = null;
                if (a != null) {
                }
                linkedHashMap.put(Integer.valueOf(i), a);
                return a;
            }
        }
        return null;
    }
}
