package me.magnum.melonds.ui.settings.fragments;

import android.content.Context;
import android.text.format.Formatter;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.preference.ListPreference;
import com.stormds.emulator.R;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@mc1(c = "me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1", f = "VideoPreferencesFragment.kt", l = {1518}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class VideoPreferencesFragment$observeShaderInstallWork$1 extends hw6 implements eo2 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ VideoPreferencesFragment Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoPreferencesFragment$observeShaderInstallWork$1(VideoPreferencesFragment videoPreferencesFragment, r41 r41Var) {
        super(2, r41Var);
        this.Z = videoPreferencesFragment;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((VideoPreferencesFragment$observeShaderInstallWork$1) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        VideoPreferencesFragment$observeShaderInstallWork$1 videoPreferencesFragment$observeShaderInstallWork$1 = new VideoPreferencesFragment$observeShaderInstallWork$1(this.Z, r41Var);
        videoPreferencesFragment$observeShaderInstallWork$1.Y = obj;
        return videoPreferencesFragment$observeShaderInstallWork$1;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        w61 w61Var = (w61) this.Y;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
            } else {
                defpackage.i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            VideoPreferencesFragment videoPreferencesFragment = this.Z;
            Context requireContext = videoPreferencesFragment.requireContext();
            requireContext.getClass();
            lw7 b = lw7.b(requireContext);
            b.getClass();
            le2 c = b.c("retroarch-shader-install");
            ne2 ne2Var = new ne2(w61Var) { // from class: me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1.1

                /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
                /* renamed from: me.magnum.melonds.ui.settings.fragments.VideoPreferencesFragment$observeShaderInstallWork$1$1$WhenMappings */
                /* loaded from: classes.dex */
                public static final /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] a;

                    static {
                        int[] iArr = new int[iw7.values().length];
                        try {
                            iArr[iw7.ENQUEUED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[iw7.BLOCKED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[iw7.RUNNING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[iw7.SUCCEEDED.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr[iw7.FAILED.ordinal()] = 5;
                        } catch (NoSuchFieldError unused5) {
                        }
                        try {
                            iArr[iw7.CANCELLED.ordinal()] = 6;
                        } catch (NoSuchFieldError unused6) {
                        }
                        a = iArr;
                    }
                }

                @Override // defpackage.ne2
                public final Object a(Object obj2, r41 r41Var) {
                    Object em5Var;
                    Object obj3 = 0;
                    jw7 jw7Var = (jw7) gt0.R0((List) obj2);
                    jg7 jg7Var = jg7.a;
                    if (jw7Var != null) {
                        xb1 xb1Var = jw7Var.d;
                        int i2 = WhenMappings.a[jw7Var.b.ordinal()];
                        String str = "";
                        VideoPreferencesFragment videoPreferencesFragment2 = VideoPreferencesFragment.this;
                        switch (i2) {
                            case 1:
                            case 2:
                                videoPreferencesFragment2.A();
                                TextView textView = videoPreferencesFragment2.A0;
                                if (textView != null) {
                                    textView.setText(R.string.video_retroarch_shader_waiting_network);
                                }
                                ProgressBar progressBar = videoPreferencesFragment2.z0;
                                if (progressBar != null) {
                                    progressBar.setIndeterminate(true);
                                }
                                TextView textView2 = videoPreferencesFragment2.B0;
                                if (textView2 != null) {
                                    textView2.setText("");
                                    break;
                                }
                                break;
                            case 3:
                                videoPreferencesFragment2.A();
                                ProgressBar progressBar2 = videoPreferencesFragment2.z0;
                                if (progressBar2 != null) {
                                    xb1 xb1Var2 = jw7Var.e;
                                    String b2 = xb1Var2.b("phase");
                                    HashMap hashMap = xb1Var2.a;
                                    if (b2 != null) {
                                        int hashCode = b2.hashCode();
                                        if (hashCode != -1851889317) {
                                            if (hashCode != -1211129254) {
                                                if (hashCode == 751558593 && b2.equals("extracting")) {
                                                    Object obj4 = hashMap.get("entries_total");
                                                    if (!(obj4 instanceof Integer)) {
                                                        obj4 = obj3;
                                                    }
                                                    int intValue = ((Number) obj4).intValue();
                                                    Object obj5 = hashMap.get("entries_done");
                                                    if (obj5 instanceof Integer) {
                                                        obj3 = obj5;
                                                    }
                                                    int intValue2 = ((Number) obj3).intValue();
                                                    TextView textView3 = videoPreferencesFragment2.A0;
                                                    if (textView3 != null) {
                                                        textView3.setText(R.string.video_retroarch_shader_extracting);
                                                    }
                                                    if (intValue > 0) {
                                                        progressBar2.setIndeterminate(false);
                                                        progressBar2.setProgress((intValue2 * 100) / intValue);
                                                        TextView textView4 = videoPreferencesFragment2.B0;
                                                        if (textView4 != null) {
                                                            textView4.setText(intValue2 + " / " + intValue);
                                                            return jg7Var;
                                                        }
                                                    } else {
                                                        progressBar2.setIndeterminate(true);
                                                        return jg7Var;
                                                    }
                                                }
                                            } else if (b2.equals("downloading")) {
                                                long a = xb1Var2.a("total_bytes");
                                                long a2 = xb1Var2.a("downloaded_bytes");
                                                TextView textView5 = videoPreferencesFragment2.A0;
                                                if (textView5 != null) {
                                                    textView5.setText(R.string.video_retroarch_shader_downloading);
                                                }
                                                if (a > 0) {
                                                    progressBar2.setIndeterminate(false);
                                                    progressBar2.setProgress((int) ((100 * a2) / a));
                                                    TextView textView6 = videoPreferencesFragment2.B0;
                                                    if (textView6 != null) {
                                                        textView6.setText(videoPreferencesFragment2.getString(R.string.video_retroarch_shader_progress_bytes, Formatter.formatShortFileSize(videoPreferencesFragment2.requireContext(), a2), Formatter.formatShortFileSize(videoPreferencesFragment2.requireContext(), a)));
                                                        return jg7Var;
                                                    }
                                                } else {
                                                    progressBar2.setIndeterminate(true);
                                                    return jg7Var;
                                                }
                                            }
                                        } else if (b2.equals("finalizing")) {
                                            TextView textView7 = videoPreferencesFragment2.A0;
                                            if (textView7 != null) {
                                                textView7.setText(R.string.video_retroarch_shader_finalizing);
                                            }
                                            progressBar2.setIndeterminate(true);
                                            TextView textView8 = videoPreferencesFragment2.B0;
                                            if (textView8 != null) {
                                                textView8.setText("");
                                                return jg7Var;
                                            }
                                        }
                                    }
                                }
                                break;
                            case 4:
                                VideoPreferencesFragment.k(videoPreferencesFragment2);
                                ListPreference listPreference = videoPreferencesFragment2.s0;
                                if (listPreference != null) {
                                    VideoPreferencesFragment.G(videoPreferencesFragment2, listPreference, null, false, 2);
                                }
                                videoPreferencesFragment2.s();
                                return jg7Var;
                            case 5:
                                VideoPreferencesFragment.k(videoPreferencesFragment2);
                                String b3 = xb1Var.b("failure_reason");
                                if (b3 != null) {
                                    str = b3;
                                }
                                try {
                                    em5Var = xo5.valueOf(str);
                                } catch (Throwable th) {
                                    em5Var = new em5(th);
                                }
                                Object obj6 = xo5.HttpError;
                                if (em5Var instanceof em5) {
                                    em5Var = obj6;
                                }
                                VideoPreferencesFragment.l(videoPreferencesFragment2, (xo5) em5Var, xb1Var.a("required_bytes"));
                                videoPreferencesFragment2.s();
                                return jg7Var;
                            case 6:
                                VideoPreferencesFragment.k(videoPreferencesFragment2);
                                videoPreferencesFragment2.s();
                                return jg7Var;
                            default:
                                defpackage.i.d();
                                return null;
                        }
                    }
                    return jg7Var;
                }
            };
            this.Y = null;
            this.X = 1;
            if (c.b(ne2Var, this) == x61Var) {
                return x61Var;
            }
        }
        return jg7.a;
    }
}
