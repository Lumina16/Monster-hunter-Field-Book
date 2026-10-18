package com.lumina.monsterhunterfieldbook;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ScaleXSpan;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.io.CloseableKt;
import kotlin.io.ConstantsKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MainActivity.kt */
@Metadata(d1 = {"\u0000Û\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001*\u0018\u00002\u00020\u0001:\u0004ó\u0001ô\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010z\u001a\u00020e2\u0006\u0010{\u001a\u00020|J\u000e\u0010}\u001a\u00020~2\u0006\u0010\u001b\u001a\u00020~J\u0007\u0010\u007f\u001a\u00030\u0080\u0001J\u0016\u0010\u0081\u0001\u001a\u00030\u0082\u00012\n\u0010\u0083\u0001\u001a\u0005\u0018\u00010\u0084\u0001H\u0014J\n\u0010\u0085\u0001\u001a\u00030\u0082\u0001H\u0002J\u0013\u0010\u0086\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0087\u0001\u001a\u00020-H\u0016J\n\u0010\u0088\u0001\u001a\u00030\u0082\u0001H\u0014J\n\u0010\u0089\u0001\u001a\u00030\u0082\u0001H\u0014J\n\u0010\u008a\u0001\u001a\u00030\u0082\u0001H\u0014J\u0014\u0010\u008b\u0001\u001a\u00030\u0082\u00012\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001H\u0016J\u0014\u0010\u008e\u0001\u001a\u00030\u0082\u00012\b\u0010\u008f\u0001\u001a\u00030\u0084\u0001H\u0014J3\u0010\u0090\u0001\u001a\u00030\u0091\u00012\u0007\u0010\u0092\u0001\u001a\u0002082\n\b\u0002\u0010\u0093\u0001\u001a\u00030\u0094\u00012\t\b\u0002\u0010\u0095\u0001\u001a\u00020-2\t\b\u0002\u0010\u0096\u0001\u001a\u00020eJ\u0013\u0010\u0097\u0001\u001a\u00030\u0098\u00012\u0007\u0010\u0092\u0001\u001a\u000208H\u0002J\u0007\u0010\u0099\u0001\u001a\u00020\u001cJ\u0007\u0010\u009a\u0001\u001a\u00020\u001cJ\u001c\u0010\u009b\u0001\u001a\u00030\u0082\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u00012\b\b\u0002\u0010{\u001a\u00020eJ*\u0010\u009e\u0001\u001a\u00030\u009f\u00012\t\b\u0002\u0010\u0096\u0001\u001a\u00020e2\t\b\u0002\u0010 \u0001\u001a\u00020-2\n\b\u0002\u0010¡\u0001\u001a\u00030\u0094\u0001J#\u0010¢\u0001\u001a\u00030\u0082\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u00012\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010¤\u0001J\"\u0010¥\u0001\u001a\u00030\u0091\u00012\u0007\u0010¦\u0001\u001a\u0002082\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010¤\u0001J*\u0010§\u0001\u001a\u00020\u00162\u0007\u0010¨\u0001\u001a\u0002082\u0007\u0010¦\u0001\u001a\u0002082\u000f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010¤\u0001J\u001b\u0010©\u0001\u001a\u00030\u0082\u00012\u0007\u0010ª\u0001\u001a\u00020\u001c2\b\b\u0002\u0010{\u001a\u00020eJ\u0011\u0010«\u0001\u001a\u00030\u0082\u00012\u0007\u0010ª\u0001\u001a\u00020\u001cJ\u0011\u0010¬\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u00ad\u0001\u001a\u000208J\n\u0010®\u0001\u001a\u00030\u0082\u0001H\u0002J\u001c\u0010¯\u0001\u001a\u00030\u0082\u00012\u0007\u0010°\u0001\u001a\u0002082\t\b\u0002\u0010±\u0001\u001a\u00020-J\n\u0010²\u0001\u001a\u00030\u0082\u0001H\u0002J\b\u0010³\u0001\u001a\u00030\u0082\u0001J\u001a\u0010´\u0001\u001a\u00030\u0082\u00012\u0007\u0010°\u0001\u001a\u0002082\u0007\u0010\u0083\u0001\u001a\u00020GJ\u0007\u0010µ\u0001\u001a\u00020-J\u0011\u0010¶\u0001\u001a\u00030\u0082\u00012\u0007\u0010·\u0001\u001a\u000208J+\u0010¸\u0001\u001a\u00030\u0082\u00012\u0007\u0010¹\u0001\u001a\u0002082\u0018\u0010º\u0001\u001a\u0013\u0012\u0007\u0012\u0005\u0018\u00010¼\u0001\u0012\u0005\u0012\u00030\u0082\u00010»\u0001J\u001b\u0010½\u0001\u001a\u00030\u0082\u00012\u0007\u0010¹\u0001\u001a\u0002082\b\u0010\u009c\u0001\u001a\u00030¾\u0001J\n\u0010¿\u0001\u001a\u00030\u0082\u0001H\u0002J\u0011\u0010À\u0001\u001a\u00030\u0082\u00012\u0007\u0010Á\u0001\u001a\u000208J\b\u0010Â\u0001\u001a\u00030\u0082\u0001J\n\u0010Ã\u0001\u001a\u00030\u0082\u0001H\u0002J3\u0010Ä\u0001\u001a\u00030\u009d\u00012\u0007\u0010Å\u0001\u001a\u0002082\b\u0010Æ\u0001\u001a\u00030\u009d\u00012\t\b\u0002\u0010Ç\u0001\u001a\u00020e2\t\b\u0002\u0010È\u0001\u001a\u00020-H\u0002J\u001e\u0010É\u0001\u001a\u00030\u0082\u00012\b\u0010\u009c\u0001\u001a\u00030\u009d\u00012\b\u0010Ê\u0001\u001a\u00030\u009d\u0001H\u0002J\n\u0010Ë\u0001\u001a\u00030\u0082\u0001H\u0002J%\u0010Ì\u0001\u001a\u00020\u001c2\u0007\u0010\u0095\u0001\u001a\u0002082\u0011\b\u0002\u0010Í\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010¤\u0001H\u0002J\n\u0010Î\u0001\u001a\u00030\u0082\u0001H\u0002J\u0013\u0010Ï\u0001\u001a\u00030\u0082\u00012\t\b\u0002\u0010Ð\u0001\u001a\u000208J\b\u0010Ñ\u0001\u001a\u00030\u0082\u0001J\b\u0010Ò\u0001\u001a\u00030\u0082\u0001J\u0010\u0010Ó\u0001\u001a\u00020\u001c2\u0007\u0010\u0095\u0001\u001a\u000208J\u0015\u0010Ô\u0001\u001a\u00030\u0082\u00012\u000b\b\u0002\u0010Å\u0001\u001a\u0004\u0018\u000108J\n\u0010Õ\u0001\u001a\u00030\u0082\u0001H\u0002J\n\u0010Ö\u0001\u001a\u00030\u0082\u0001H\u0002J$\u0010×\u0001\u001a\u00020\u001c2\b\u0010Ø\u0001\u001a\u00030Ù\u00012\u0011\b\u0002\u0010Ú\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010¤\u0001J\n\u0010Û\u0001\u001a\u00030\u0082\u0001H\u0002J\u0012\u0010Ü\u0001\u001a\u00030\u0082\u00012\b\u0010Ø\u0001\u001a\u00030Ù\u0001J\u0007\u0010Ý\u0001\u001a\u00020-J\u001e\u0010Þ\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0092\u0001\u001a\u0002082\u000b\b\u0002\u0010Å\u0001\u001a\u0004\u0018\u000108J!\u0010ß\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0095\u0001\u001a\u0002082\u000e\u0010à\u0001\u001a\t\u0012\u0005\u0012\u00030Ù\u00010]J\u0010\u0010á\u0001\u001a\u00020-2\u0007\u0010â\u0001\u001a\u000208J\u0011\u0010ã\u0001\u001a\u00030\u0082\u00012\u0007\u0010â\u0001\u001a\u000208J\b\u0010ä\u0001\u001a\u00030\u0082\u0001J\u0012\u0010å\u0001\u001a\u00030\u0082\u00012\b\u0010æ\u0001\u001a\u00030ç\u0001J\b\u0010è\u0001\u001a\u00030\u0082\u0001J\u0013\u0010é\u0001\u001a\u0002082\b\u0010\u0092\u0001\u001a\u00030ê\u0001H\u0002J\n\u0010ë\u0001\u001a\u00030\u0082\u0001H\u0002J\b\u0010ì\u0001\u001a\u00030\u0082\u0001J(\u0010í\u0001\u001a\u00030\u0082\u00012\u0007\u0010î\u0001\u001a\u00020e2\u0007\u0010ï\u0001\u001a\u00020e2\n\u0010ð\u0001\u001a\u0005\u0018\u00010ñ\u0001H\u0015J\n\u0010ò\u0001\u001a\u00030\u0082\u0001H\u0017R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0016X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010%\u001a\n '*\u0004\u0018\u00010&0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010(\u001a\n '*\u0004\u0018\u00010&0&X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0004\n\u0002\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00100\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010>\u001a\u0004\u0018\u00010?X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010@\u001a\u0004\u0018\u00010AX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010C\u001a\u0004\u0018\u00010DX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010E\u001a\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u00020G0FX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010H\u001a\u00020GX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020NX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u0011\u0010S\u001a\u0002088F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\b\u0012\u0004\u0012\u0002080WX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u000208X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020ZX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020ZX\u0082\u000e¢\u0006\u0002\n\u0000R \u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000208\u0012\u0004\u0012\u0002080^0]X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010_\u001a\b\u0012\u0004\u0012\u00020a0`X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010b\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0011\u0010d\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010h\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bi\u0010gR\u0011\u0010j\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bk\u0010gR\u0011\u0010l\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bm\u0010gR\u0011\u0010n\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bo\u0010gR\u0011\u0010p\u001a\u00020e8F¢\u0006\u0006\u001a\u0004\bq\u0010gR\u0011\u0010r\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bs\u0010cR\u0011\u0010t\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bu\u0010cR\u0011\u0010v\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\bw\u0010cR\u0011\u0010x\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\by\u0010c¨\u0006õ\u0001"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/MainActivity;", "Landroid/app/Activity;", "<init>", "()V", "prefs", "Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "getPrefs", "()Lcom/lumina/monsterhunterfieldbook/NativePrefs;", "setPrefs", "(Lcom/lumina/monsterhunterfieldbook/NativePrefs;)V", "catalogue", "Lcom/lumina/monsterhunterfieldbook/Catalogue;", "getCatalogue", "()Lcom/lumina/monsterhunterfieldbook/Catalogue;", "setCatalogue", "(Lcom/lumina/monsterhunterfieldbook/Catalogue;)V", "audio", "Lcom/lumina/monsterhunterfieldbook/FieldAudio;", "music", "getMusic", "()Lcom/lumina/monsterhunterfieldbook/FieldAudio;", "root", "Landroid/widget/FrameLayout;", "getRoot", "()Landroid/widget/FrameLayout;", "setRoot", "(Landroid/widget/FrameLayout;)V", "base", "Landroid/widget/LinearLayout;", "content", "emblem", "Lcom/lumina/monsterhunterfieldbook/EmblemView;", "bodyFont", "Landroid/graphics/Typeface;", "titleFont", "handler", "Landroid/os/Handler;", "images", "Ljava/util/concurrent/ExecutorService;", "kotlin.jvm.PlatformType", "fileIo", "cache", "com/lumina/monsterhunterfieldbook/MainActivity$cache$1", "Lcom/lumina/monsterhunterfieldbook/MainActivity$cache$1;", "ready", "", "foreground", "introDone", "introView", "introAnimator", "Landroid/animation/ValueAnimator;", "introStarted", "destroyed", "searchGeneration", "Ljava/util/concurrent/atomic/AtomicInteger;", "searchQuery", "", "searchKind", "searchRelated", "queryInput", "Landroid/widget/EditText;", "resultBody", "resultScroll", "Landroid/widget/ScrollView;", "settings", "Lcom/lumina/monsterhunterfieldbook/SettingsPanel;", "activeSection", "library", "Lcom/lumina/monsterhunterfieldbook/LibraryScreen;", "libraryStates", "", "Lorg/json/JSONObject;", "libraryData", "getLibraryData", "()Lorg/json/JSONObject;", "setLibraryData", "(Lorg/json/JSONObject;)V", "backups", "Lcom/lumina/monsterhunterfieldbook/BackupController;", "getBackups", "()Lcom/lumina/monsterhunterfieldbook/BackupController;", "setBackups", "(Lcom/lumina/monsterhunterfieldbook/BackupController;)V", "currentEdition", "getCurrentEdition", "()Ljava/lang/String;", "sectionHistory", "Ljava/util/ArrayDeque;", "edition", "recent", "Lorg/json/JSONArray;", "bookmarks", "sections", "", "Lkotlin/Pair;", "overlays", "", "Lcom/lumina/monsterhunterfieldbook/MainActivity$Overlay;", "isIce", "()Z", "bg", "", "getBg", "()I", "accent", "getAccent", "ink", "getInk", "panel", "getPanel", "muted", "getMuted", "line", "getLine", "wide", "getWide", "landscape", "getLandscape", "useSplitLibrary", "getUseSplitLibrary", "historyEnabled", "getHistoryEnabled", "dp", "n", "", "motionDuration", "", "themeColours", "", "onCreate", "", "state", "Landroid/os/Bundle;", "fullscreen", "onWindowFocusChanged", "hasFocus", "onResume", "onPause", "onDestroy", "onConfigurationChanged", "config", "Landroid/content/res/Configuration;", "onSaveInstanceState", "out", "text", "Landroid/widget/TextView;", "value", "size", "", "title", "colour", "spaced", "", "column", "row", "pad", "view", "Landroid/view/View;", "surface", "Landroid/graphics/drawable/GradientDrawable;", "stroke", "radius", "touch", "onClick", "Lkotlin/Function0;", "button", "label", "iconButton", "glyph", "gap", "parent", "rule", "toast", "message", "renderBase", "navigate", "section", "remember", "renderSection", "refreshCurrentSection", "replaceLibraryState", "worldComplete", "switchEdition", "next", "loadBitmap", "path", "callback", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "assetImage", "Landroid/widget/ImageView;", "overview", "afterPreference", "key", "clearSearchHistory", "showIntro", "present", "kind", "body", "width", "menu", "enter", "container", "dismiss", "heading", "close", "showMenu", "showSettings", "category", "closeTop", "rebuildSettings", "settingsHeading", "showSearch", "hideKeyboard", "runSearch", "recordRow", "record", "Lcom/lumina/monsterhunterfieldbook/FieldRecord;", "onOpen", "rememberQuery", "showRecord", "closeLibraryDetail", "openReference", "showRecordList", "records", "isBookmarked", "id", "toggleBookmark", "reloadStoredState", "importMusic", "uri", "Landroid/net/Uri;", "showCampChecklist", "readable", "", "showSaved", "showCredits", "onActivityResult", "request", "result", "data", "Landroid/content/Intent;", "onBackPressed", "Overlay", "BoundPanel", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MainActivity extends Activity {
    private FieldAudio audio;
    public BackupController backups;
    private LinearLayout base;
    private Typeface bodyFont;
    public Catalogue catalogue;
    private FrameLayout content;
    private boolean destroyed;
    private EmblemView emblem;
    private boolean foreground;
    private ValueAnimator introAnimator;
    private boolean introDone;
    private boolean introStarted;
    private FrameLayout introView;
    private LibraryScreen library;
    public JSONObject libraryData;
    public NativePrefs prefs;
    private EditText queryInput;
    private boolean ready;
    private LinearLayout resultBody;
    private ScrollView resultScroll;
    public FrameLayout root;
    private boolean searchRelated;
    private SettingsPanel settings;
    private Typeface titleFont;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final ExecutorService images = Executors.newFixedThreadPool(2);
    private final ExecutorService fileIo = Executors.newSingleThreadExecutor();
    private final MainActivity$cache$1 cache = new LruCache<String, Bitmap>() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$cache$1
        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.util.LruCache
        public int sizeOf(String key, Bitmap value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            return value.getByteCount() / 1024;
        }
    };
    private final AtomicInteger searchGeneration = new AtomicInteger();
    private String searchQuery = "";
    private String searchKind = "All";
    private String activeSection = "overview";
    private final Map<String, JSONObject> libraryStates = new LinkedHashMap();
    private final ArrayDeque<String> sectionHistory = new ArrayDeque<>();
    private String edition = "world";
    private JSONArray recent = new JSONArray();
    private JSONArray bookmarks = new JSONArray();
    private final List<Pair<String, String>> sections = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("overview", "Overview"), TuplesKt.to("bestiary", "Bestiary"), TuplesKt.to("weapons", "Weapons"), TuplesKt.to("equipment", "Equipment"), TuplesKt.to("locales", "Locales"), TuplesKt.to("progression", "Speedrun"), TuplesKt.to("preparation", "Item Libraries"), TuplesKt.to("notes", "Field Notes"), TuplesKt.to("quests", "Quests")});
    private final List<Overlay> overlays = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final void present$lambda$1(View view) {
    }

    public final NativePrefs getPrefs() {
        NativePrefs nativePrefs = this.prefs;
        if (nativePrefs != null) {
            return nativePrefs;
        }
        Intrinsics.throwUninitializedPropertyAccessException("prefs");
        return null;
    }

    public final void setPrefs(NativePrefs nativePrefs) {
        Intrinsics.checkNotNullParameter(nativePrefs, "<set-?>");
        this.prefs = nativePrefs;
    }

    public final Catalogue getCatalogue() {
        Catalogue catalogue = this.catalogue;
        if (catalogue != null) {
            return catalogue;
        }
        Intrinsics.throwUninitializedPropertyAccessException("catalogue");
        return null;
    }

    public final void setCatalogue(Catalogue catalogue) {
        Intrinsics.checkNotNullParameter(catalogue, "<set-?>");
        this.catalogue = catalogue;
    }

    public final FieldAudio getMusic() {
        FieldAudio fieldAudio = this.audio;
        if (fieldAudio != null) {
            return fieldAudio;
        }
        Intrinsics.throwUninitializedPropertyAccessException("audio");
        return null;
    }

    public final FrameLayout getRoot() {
        FrameLayout frameLayout = this.root;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.throwUninitializedPropertyAccessException("root");
        return null;
    }

    public final void setRoot(FrameLayout frameLayout) {
        Intrinsics.checkNotNullParameter(frameLayout, "<set-?>");
        this.root = frameLayout;
    }

    public final JSONObject getLibraryData() {
        JSONObject jSONObject = this.libraryData;
        if (jSONObject != null) {
            return jSONObject;
        }
        Intrinsics.throwUninitializedPropertyAccessException("libraryData");
        return null;
    }

    public final void setLibraryData(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<set-?>");
        this.libraryData = jSONObject;
    }

    public final BackupController getBackups() {
        BackupController backupController = this.backups;
        if (backupController != null) {
            return backupController;
        }
        Intrinsics.throwUninitializedPropertyAccessException("backups");
        return null;
    }

    public final void setBackups(BackupController backupController) {
        Intrinsics.checkNotNullParameter(backupController, "<set-?>");
        this.backups = backupController;
    }

    /* renamed from: getCurrentEdition, reason: from getter */
    public final String getEdition() {
        return this.edition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\tHÆ\u0003J1\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\t2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/lumina/monsterhunterfieldbook/MainActivity$Overlay;", "", "kind", "", "container", "Landroid/widget/FrameLayout;", "panel", "Landroid/view/View;", "closing", "", "<init>", "(Ljava/lang/String;Landroid/widget/FrameLayout;Landroid/view/View;Z)V", "getKind", "()Ljava/lang/String;", "getContainer", "()Landroid/widget/FrameLayout;", "getPanel", "()Landroid/view/View;", "getClosing", "()Z", "setClosing", "(Z)V", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    static final /* data */ class Overlay {
        private boolean closing;
        private final FrameLayout container;
        private final String kind;
        private final View panel;

        public static /* synthetic */ Overlay copy$default(Overlay overlay, String str, FrameLayout frameLayout, View view, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = overlay.kind;
            }
            if ((i & 2) != 0) {
                frameLayout = overlay.container;
            }
            if ((i & 4) != 0) {
                view = overlay.panel;
            }
            if ((i & 8) != 0) {
                z = overlay.closing;
            }
            return overlay.copy(str, frameLayout, view, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* renamed from: component2, reason: from getter */
        public final FrameLayout getContainer() {
            return this.container;
        }

        /* renamed from: component3, reason: from getter */
        public final View getPanel() {
            return this.panel;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getClosing() {
            return this.closing;
        }

        public final Overlay copy(String kind, FrameLayout container, View panel, boolean closing) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(panel, "panel");
            return new Overlay(kind, container, panel, closing);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Overlay)) {
                return false;
            }
            Overlay overlay = (Overlay) other;
            return Intrinsics.areEqual(this.kind, overlay.kind) && Intrinsics.areEqual(this.container, overlay.container) && Intrinsics.areEqual(this.panel, overlay.panel) && this.closing == overlay.closing;
        }

        public int hashCode() {
            return (((((this.kind.hashCode() * 31) + this.container.hashCode()) * 31) + this.panel.hashCode()) * 31) + Boolean.hashCode(this.closing);
        }

        public String toString() {
            return "Overlay(kind=" + this.kind + ", container=" + this.container + ", panel=" + this.panel + ", closing=" + this.closing + ")";
        }

        public Overlay(String kind, FrameLayout container, View panel, boolean z) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(container, "container");
            Intrinsics.checkNotNullParameter(panel, "panel");
            this.kind = kind;
            this.container = container;
            this.panel = panel;
            this.closing = z;
        }

        public /* synthetic */ Overlay(String str, FrameLayout frameLayout, View view, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, frameLayout, view, (i & 8) != 0 ? false : z);
        }

        public final boolean getClosing() {
            return this.closing;
        }

        public final FrameLayout getContainer() {
            return this.container;
        }

        public final String getKind() {
            return this.kind;
        }

        public final View getPanel() {
            return this.panel;
        }

        public final void setClosing(boolean z) {
            this.closing = z;
        }
    }

    public final boolean isIce() {
        return Intrinsics.areEqual(this.edition, "iceborne");
    }

    public final int getBg() {
        return themeColours()[0];
    }

    public final int getAccent() {
        return themeColours()[1];
    }

    public final int getInk() {
        return themeColours()[2];
    }

    public final int getPanel() {
        return FieldViewsKt.blend(getBg(), getInk(), 0.045f);
    }

    public final int getMuted() {
        return FieldViewsKt.blend(getBg(), getInk(), 0.65f);
    }

    public final int getLine() {
        return FieldViewsKt.blend(getBg(), getInk(), 0.2f);
    }

    public final boolean getWide() {
        return getResources().getConfiguration().screenWidthDp >= 650;
    }

    public final boolean getLandscape() {
        return getResources().getConfiguration().orientation == 2;
    }

    public final boolean getUseSplitLibrary() {
        if (getResources().getConfiguration().screenWidthDp < 600) {
            return getLandscape() && getResources().getConfiguration().screenWidthDp >= 560;
        }
        return true;
    }

    public final boolean getHistoryEnabled() {
        return NativePrefs.flag$default(getPrefs(), "searchHistory", false, 2, null);
    }

    public final int dp(Number n) {
        Intrinsics.checkNotNullParameter(n, "n");
        return MathKt.roundToInt(n.floatValue() * getResources().getDisplayMetrics().density);
    }

    public final long motionDuration(long base) {
        int number;
        if (NativePrefs.flag$default(getPrefs(), "animations", false, 2, null) && (number = getPrefs().number("speed", 50)) != 0) {
            return (long) (base * (1.65f - (number * 0.013f)));
        }
        return 0L;
    }

    public final int[] themeColours() {
        String text = getPrefs().text("theme", "game");
        int[] iArr = isIce() ? new int[]{Color.rgb(12, 20, 34), Color.rgb(159, 212, 237), Color.rgb(231, 239, 243)} : new int[]{Color.rgb(13, 21, 18), Color.rgb(217, 183, 122), Color.rgb(238, 233, 220)};
        if (Intrinsics.areEqual(text, "custom")) {
            return new int[]{getPrefs().number("customBg", iArr[0]), getPrefs().number("customAccent", iArr[1]), getPrefs().number("customInk", iArr[2])};
        }
        int[] iArr2 = SettingsPanel.Companion.getPalettes().get(text);
        return iArr2 == null ? iArr : iArr2;
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle state) {
        String text;
        String str;
        String str2;
        String str3;
        Object m65constructorimpl;
        Object m65constructorimpl2;
        Object m65constructorimpl3;
        Object m65constructorimpl4;
        ArrayList<String> stringArrayList;
        String string;
        Object m65constructorimpl5;
        super.onCreate(state);
        setVolumeControlStream(3);
        MainActivity mainActivity = this;
        setPrefs(new NativePrefs(mainActivity));
        InputStream open = getAssets().open("library.json");
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, ConstantsKt.DEFAULT_BUFFER_SIZE);
        try {
            JSONObject jSONObject = new JSONObject(TextStreamsKt.readText(bufferedReader));
            CloseableKt.closeFinally(bufferedReader, null);
            setLibraryData(jSONObject);
            setBackups(new BackupController(this));
            if (state == null || (text = state.getString("edition")) == null) {
                text = getPrefs().text("edition", "world");
                Intrinsics.checkNotNullExpressionValue(text, "text(...)");
            }
            this.edition = text;
            if (state == null || (str = state.getString("section")) == null) {
                if (Intrinsics.areEqual(getPrefs().text("startup", "overview"), "last")) {
                    str = getPrefs().text("lastSection", "overview");
                    Intrinsics.checkNotNullExpressionValue(str, "text(...)");
                } else {
                    str = "overview";
                }
            }
            this.activeSection = str;
            if (state == null || (str2 = state.getString("query")) == null) {
                str2 = "";
            }
            this.searchQuery = str2;
            if (state == null || (str3 = state.getString("kind")) == null) {
                str3 = "All";
            }
            this.searchKind = str3;
            if (state != null && (string = state.getString("libraries")) != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    MainActivity mainActivity2 = this;
                    m65constructorimpl5 = Result.m65constructorimpl(new JSONObject(string));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m65constructorimpl5 = Result.m65constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m71isFailureimpl(m65constructorimpl5)) {
                    m65constructorimpl5 = null;
                }
                JSONObject jSONObject2 = (JSONObject) m65constructorimpl5;
                if (jSONObject2 != null) {
                    Iterator<String> keys = jSONObject2.keys();
                    Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
                    while (keys.hasNext()) {
                        String next = keys.next();
                        this.libraryStates.put(next, jSONObject2.getJSONObject(next));
                    }
                }
            }
            if (state != null && (stringArrayList = state.getStringArrayList("navigation")) != null) {
                Iterator<T> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    this.sectionHistory.addLast((String) it.next());
                }
            }
            try {
                Result.Companion companion3 = Result.INSTANCE;
                MainActivity mainActivity3 = this;
                m65constructorimpl = Result.m65constructorimpl(new JSONArray(getPrefs().text("recent", "[]")));
            } catch (Throwable th2) {
                Result.Companion companion4 = Result.INSTANCE;
                m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th2));
            }
            JSONArray jSONArray = new JSONArray();
            if (Result.m71isFailureimpl(m65constructorimpl)) {
                m65constructorimpl = jSONArray;
            }
            this.recent = (JSONArray) m65constructorimpl;
            try {
                Result.Companion companion5 = Result.INSTANCE;
                MainActivity mainActivity4 = this;
                m65constructorimpl2 = Result.m65constructorimpl(new JSONArray(getPrefs().text("bookmarks", "[]")));
            } catch (Throwable th3) {
                Result.Companion companion6 = Result.INSTANCE;
                m65constructorimpl2 = Result.m65constructorimpl(ResultKt.createFailure(th3));
            }
            JSONArray jSONArray2 = new JSONArray();
            if (Result.m71isFailureimpl(m65constructorimpl2)) {
                m65constructorimpl2 = jSONArray2;
            }
            this.bookmarks = (JSONArray) m65constructorimpl2;
            try {
                Result.Companion companion7 = Result.INSTANCE;
                MainActivity mainActivity5 = this;
                m65constructorimpl3 = Result.m65constructorimpl(Typeface.createFromAsset(getAssets(), "fonts/title.ttf"));
            } catch (Throwable th4) {
                Result.Companion companion8 = Result.INSTANCE;
                m65constructorimpl3 = Result.m65constructorimpl(ResultKt.createFailure(th4));
            }
            Typeface create = Typeface.create("serif", 0);
            if (Result.m71isFailureimpl(m65constructorimpl3)) {
                m65constructorimpl3 = create;
            }
            Intrinsics.checkNotNullExpressionValue(m65constructorimpl3, "getOrDefault(...)");
            this.titleFont = (Typeface) m65constructorimpl3;
            try {
                Result.Companion companion9 = Result.INSTANCE;
                MainActivity mainActivity6 = this;
                m65constructorimpl4 = Result.m65constructorimpl(Typeface.createFromAsset(getAssets(), "fonts/body.ttf"));
            } catch (Throwable th5) {
                Result.Companion companion10 = Result.INSTANCE;
                m65constructorimpl4 = Result.m65constructorimpl(ResultKt.createFailure(th5));
            }
            Typeface create2 = Typeface.create("sans-serif", 0);
            if (Result.m71isFailureimpl(m65constructorimpl4)) {
                m65constructorimpl4 = create2;
            }
            Intrinsics.checkNotNullExpressionValue(m65constructorimpl4, "getOrDefault(...)");
            this.bodyFont = (Typeface) m65constructorimpl4;
            FieldAudio fieldAudio = new FieldAudio(mainActivity, getPrefs());
            this.audio = fieldAudio;
            fieldAudio.play(this.edition);
            setCatalogue(new Catalogue(mainActivity));
            setRoot(new FrameLayout(mainActivity));
            getRoot().setBackgroundColor(getBg());
            setContentView(getRoot());
            fullscreen();
            renderBase();
            getCatalogue().getExecutor().execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.onCreate$lambda$7(MainActivity.this);
                }
            });
            if (state == null) {
                showIntro();
                return;
            }
            this.introDone = true;
            FieldAudio fieldAudio2 = this.audio;
            if (fieldAudio2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audio");
                fieldAudio2 = null;
            }
            fieldAudio2.introductionFinished();
            String string2 = state.getString("overlay");
            if (string2 != null) {
                int hashCode = string2.hashCode();
                if (hashCode != -906336856) {
                    if (hashCode == 1434631203 && string2.equals("settings")) {
                        String string3 = state.getString("settingsTab");
                        if (string3 == null) {
                            string3 = "Appearance";
                        }
                        showSettings(string3);
                    }
                } else if (string2.equals("search")) {
                    showSearch$default(this, null, 1, null);
                }
            }
            final ArrayList<String> stringArrayList2 = state.getStringArrayList("records");
            if (stringArrayList2 == null) {
                stringArrayList2 = new ArrayList<>();
            }
            if (stringArrayList2.isEmpty()) {
                return;
            }
            getCatalogue().getExecutor().execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda8
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.onCreate$lambda$8(stringArrayList2, this);
                }
            });
        } catch (Throwable th6) {
            try {
                throw th6;
            } catch (Throwable th7) {
                CloseableKt.closeFinally(bufferedReader, th6);
                throw th7;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7(final MainActivity mainActivity) {
        Object m65constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            mainActivity.getCatalogue().open();
            m65constructorimpl = Result.m65constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m72isSuccessimpl(m65constructorimpl)) {
            mainActivity.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda26
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.onCreate$lambda$7$1$0(MainActivity.this);
                }
            });
        }
        final Throwable m68exceptionOrNullimpl = Result.m68exceptionOrNullimpl(m65constructorimpl);
        if (m68exceptionOrNullimpl != null) {
            mainActivity.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda27
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.onCreate$lambda$7$2$0(MainActivity.this, m68exceptionOrNullimpl);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7$1$0(MainActivity mainActivity) {
        if (mainActivity.destroyed) {
            return;
        }
        mainActivity.ready = true;
        Overlay overlay = (Overlay) CollectionsKt.lastOrNull((List) mainActivity.overlays);
        if (Intrinsics.areEqual(overlay != null ? overlay.getKind() : null, "search")) {
            mainActivity.runSearch();
        }
        if (Intrinsics.areEqual(mainActivity.activeSection, "overview")) {
            return;
        }
        mainActivity.renderSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$7$2$0(MainActivity mainActivity, Throwable th) {
        if (mainActivity.destroyed) {
            return;
        }
        mainActivity.toast("Offline catalogue could not open: " + th.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8(ArrayList arrayList, final MainActivity mainActivity) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Catalogue catalogue = mainActivity.getCatalogue();
            Intrinsics.checkNotNull(str);
            FieldRecord record = catalogue.record(str);
            if (record != null) {
                arrayList2.add(record);
            }
        }
        final ArrayList arrayList3 = arrayList2;
        mainActivity.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda54
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.onCreate$lambda$8$1(MainActivity.this, arrayList3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$8$1(MainActivity mainActivity, List list) {
        if (mainActivity.destroyed) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mainActivity.showRecord((FieldRecord) it.next());
        }
    }

    private final void fullscreen() {
        getWindow().addFlags(1024);
        if (Build.VERSION.SDK_INT >= 30) {
            getWindow().setDecorFitsSystemWindows(false);
            WindowInsetsController insetsController = getWindow().getInsetsController();
            if (insetsController != null) {
                insetsController.hide(WindowInsets.Type.systemBars());
                insetsController.setSystemBarsBehavior(2);
            }
        } else {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            Window window = getWindow();
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.layoutInDisplayCutoutMode = 2;
            window.setAttributes(attributes);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            fullscreen();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        ValueAnimator valueAnimator;
        super.onResume();
        this.foreground = true;
        FieldAudio fieldAudio = this.audio;
        if (fieldAudio == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audio");
            fieldAudio = null;
        }
        fieldAudio.resume();
        if (this.introDone || !this.introStarted || (valueAnimator = this.introAnimator) == null) {
            return;
        }
        valueAnimator.resume();
    }

    @Override // android.app.Activity
    protected void onPause() {
        this.foreground = false;
        FieldAudio fieldAudio = this.audio;
        if (fieldAudio == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audio");
            fieldAudio = null;
        }
        fieldAudio.pause();
        ValueAnimator valueAnimator = this.introAnimator;
        if (valueAnimator != null) {
            valueAnimator.pause();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.destroyed = true;
        this.searchGeneration.incrementAndGet();
        FieldAudio fieldAudio = null;
        this.handler.removeCallbacksAndMessages(null);
        ValueAnimator valueAnimator = this.introAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        FieldAudio fieldAudio2 = this.audio;
        if (fieldAudio2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audio");
        } else {
            fieldAudio = fieldAudio2;
        }
        fieldAudio.release();
        getBackups().release();
        this.fileIo.shutdownNow();
        this.images.shutdownNow();
        getCatalogue().close();
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigurationChanged$lambda$0(MainActivity mainActivity, int i) {
        FrameLayout frameLayout = mainActivity.content;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("content");
            frameLayout = null;
        }
        View childAt = frameLayout.getChildAt(0);
        ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
        if (scrollView != null) {
            scrollView.scrollTo(0, i);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        super.onConfigurationChanged(config);
        fullscreen();
        FrameLayout frameLayout = this.content;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("content");
            frameLayout = null;
        }
        View childAt = frameLayout.getChildAt(0);
        ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
        final int scrollY = scrollView != null ? scrollView.getScrollY() : 0;
        renderBase();
        FrameLayout frameLayout2 = this.content;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("content");
            frameLayout2 = null;
        }
        View childAt2 = frameLayout2.getChildAt(0);
        ScrollView scrollView2 = childAt2 instanceof ScrollView ? (ScrollView) childAt2 : null;
        if (scrollView2 != null) {
            scrollView2.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.onConfigurationChanged$lambda$0(MainActivity.this, scrollY);
                }
            });
        }
        SettingsPanel settingsPanel = this.settings;
        if (settingsPanel != null) {
            Overlay overlay = (Overlay) CollectionsKt.lastOrNull((List) this.overlays);
            SettingsPanel settingsPanel2 = Intrinsics.areEqual(overlay != null ? overlay.getKind() : null, "settings") ? settingsPanel : null;
            if (settingsPanel2 != null) {
                settingsPanel2.rebuild();
            }
        }
        getRoot().requestLayout();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle out) {
        Overlay overlay;
        Intrinsics.checkNotNullParameter(out, "out");
        LibraryScreen libraryScreen = this.library;
        if (libraryScreen != null) {
            this.libraryStates.put(this.activeSection, libraryScreen.snapshot());
        }
        out.putString("edition", this.edition);
        out.putString("section", this.activeSection);
        out.putString("query", this.searchQuery);
        out.putString("kind", this.searchKind);
        List<Overlay> list = this.overlays;
        ListIterator<Overlay> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                overlay = null;
                break;
            } else {
                overlay = listIterator.previous();
                if (!Intrinsics.areEqual(overlay.getKind(), "record")) {
                    break;
                }
            }
        }
        Overlay overlay2 = overlay;
        out.putString("overlay", overlay2 != null ? overlay2.getKind() : null);
        SettingsPanel settingsPanel = this.settings;
        out.putString("settingsTab", settingsPanel != null ? settingsPanel.getCategory() : null);
        Map<String, JSONObject> map = this.libraryStates;
        Intrinsics.checkNotNull(map, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
        out.putString("libraries", new JSONObject(map).toString());
        out.putStringArrayList("navigation", new ArrayList<>(this.sectionHistory));
        List<Overlay> list2 = this.overlays;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            View panel = ((Overlay) it.next()).getPanel();
            ViewGroup viewGroup = panel instanceof ViewGroup ? (ViewGroup) panel : null;
            View childAt = viewGroup != null ? viewGroup.getChildAt(0) : null;
            RecordPanel recordPanel = childAt instanceof RecordPanel ? (RecordPanel) childAt : null;
            if (recordPanel != null) {
                arrayList.add(recordPanel);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((RecordPanel) it2.next()).getRecord().getId());
        }
        out.putStringArrayList("records", new ArrayList<>(arrayList3));
        super.onSaveInstanceState(out);
    }

    public static /* synthetic */ TextView text$default(MainActivity mainActivity, String str, float f, boolean z, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 14.0f;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        if ((i2 & 8) != 0) {
            i = mainActivity.getInk();
        }
        return mainActivity.text(str, f, z, i);
    }

    public final TextView text(String value, float size, boolean title, int colour) {
        Typeface typeface;
        String str;
        Intrinsics.checkNotNullParameter(value, "value");
        TextView textView = new TextView(this);
        textView.setText(spaced(value));
        textView.setTextSize((getPrefs().number("font", 100) * size) / 100.0f);
        Typeface typeface2 = null;
        if (title) {
            typeface = this.titleFont;
            if (typeface == null) {
                str = "titleFont";
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            typeface2 = typeface;
        } else {
            typeface = this.bodyFont;
            if (typeface == null) {
                str = "bodyFont";
                Intrinsics.throwUninitializedPropertyAccessException(str);
            }
            typeface2 = typeface;
        }
        textView.setTypeface(typeface2);
        textView.setTextColor(colour);
        textView.setTag(Float.valueOf(size));
        textView.setLineSpacing(dp(Integer.valueOf(getPrefs().number("lineSpacing", 0))), 1.22f);
        textView.setLetterSpacing(getPrefs().number("letterSpacing", 0) / 100.0f);
        textView.setImportantForAccessibility(1);
        return textView;
    }

    private final CharSequence spaced(String value) {
        int i = 0;
        int number = getPrefs().number("wordSpacing", 0);
        if (number == 0) {
            return value;
        }
        String str = value;
        SpannableString spannableString = new SpannableString(str);
        int i2 = 0;
        while (i < str.length()) {
            int i3 = i2 + 1;
            if (str.charAt(i) == ' ') {
                spannableString.setSpan(new ScaleXSpan(1 + (number * 0.08f)), i2, i3, 33);
            }
            i++;
            i2 = i3;
        }
        return spannableString;
    }

    public final LinearLayout column() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        return linearLayout;
    }

    public final LinearLayout row() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        return linearLayout;
    }

    public static /* synthetic */ void pad$default(MainActivity mainActivity, View view, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 16;
        }
        mainActivity.pad(view, i);
    }

    public final void pad(View view, int n) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setPadding(dp(Integer.valueOf(n)), dp(Integer.valueOf(n)), dp(Integer.valueOf(n)), dp(Integer.valueOf(n)));
    }

    public static /* synthetic */ GradientDrawable surface$default(MainActivity mainActivity, int i, boolean z, float f, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mainActivity.getPanel();
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            f = 4.0f;
        }
        return mainActivity.surface(i, z, f);
    }

    public final GradientDrawable surface(int colour, boolean stroke, float radius) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(dp(Float.valueOf(radius)));
        gradientDrawable.setColor(colour);
        if (stroke) {
            gradientDrawable.setStroke(dp((Number) 1), getLine());
        }
        if (NativePrefs.flag$default(getPrefs(), "gradients", false, 2, null) && getPrefs().number("gradientStrength", 18) > 0) {
            gradientDrawable.setColors(new int[]{FieldViewsKt.blend(colour, getAccent(), getPrefs().number("gradientStrength", 18) / 220.0f), colour});
            int number = getPrefs().number("gradientAngle", 0);
            gradientDrawable.setOrientation(number != 1 ? number != 2 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.TOP_BOTTOM : GradientDrawable.Orientation.TL_BR);
        }
        return gradientDrawable;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void touch(View view, final Function0<Unit> onClick) {
        int rgb;
        int i;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        String text = getPrefs().text("touch", "ripple");
        GradientDrawable background = view.getBackground();
        if (background == null) {
            background = surface$default(this, 0, false, 0.0f, 4, null);
        }
        if (!Intrinsics.areEqual(text, "none") && NativePrefs.flag$default(getPrefs(), "animations", false, 2, null) && getPrefs().number("speed", 50) > 0) {
            if (text != null) {
                int hashCode = text.hashCode();
                if (hashCode != -896177866) {
                    if (hashCode != 3175821) {
                        if (hashCode == 3194940 && text.equals("halo")) {
                            rgb = getAccent();
                            i = 40;
                            ColorStateList valueOf = ColorStateList.valueOf(FieldViewsKt.alphaColour(rgb, i));
                            GradientDrawable gradientDrawable = new GradientDrawable();
                            gradientDrawable.setColor(-1);
                            gradientDrawable.setCornerRadius(dp((Number) 4));
                            Unit unit = Unit.INSTANCE;
                            RippleDrawable rippleDrawable = new RippleDrawable(valueOf, background, gradientDrawable);
                            if (Intrinsics.areEqual(text, "ripple")) {
                                rippleDrawable.setRadius(dp((Number) 280));
                            }
                            view.setBackground(rippleDrawable);
                        }
                    } else if (text.equals("glow")) {
                        rgb = getAccent();
                        i = 85;
                        ColorStateList valueOf2 = ColorStateList.valueOf(FieldViewsKt.alphaColour(rgb, i));
                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                        gradientDrawable2.setColor(-1);
                        gradientDrawable2.setCornerRadius(dp((Number) 4));
                        Unit unit2 = Unit.INSTANCE;
                        RippleDrawable rippleDrawable2 = new RippleDrawable(valueOf2, background, gradientDrawable2);
                        if (Intrinsics.areEqual(text, "ripple")) {
                        }
                        view.setBackground(rippleDrawable2);
                    }
                } else if (text.equals("sparks")) {
                    rgb = getAccent();
                    i = 105;
                    ColorStateList valueOf22 = ColorStateList.valueOf(FieldViewsKt.alphaColour(rgb, i));
                    GradientDrawable gradientDrawable22 = new GradientDrawable();
                    gradientDrawable22.setColor(-1);
                    gradientDrawable22.setCornerRadius(dp((Number) 4));
                    Unit unit22 = Unit.INSTANCE;
                    RippleDrawable rippleDrawable22 = new RippleDrawable(valueOf22, background, gradientDrawable22);
                    if (Intrinsics.areEqual(text, "ripple")) {
                    }
                    view.setBackground(rippleDrawable22);
                }
            }
            rgb = Color.rgb(217, 183, 122);
            i = 70;
            ColorStateList valueOf222 = ColorStateList.valueOf(FieldViewsKt.alphaColour(rgb, i));
            GradientDrawable gradientDrawable222 = new GradientDrawable();
            gradientDrawable222.setColor(-1);
            gradientDrawable222.setCornerRadius(dp((Number) 4));
            Unit unit222 = Unit.INSTANCE;
            RippleDrawable rippleDrawable222 = new RippleDrawable(valueOf222, background, gradientDrawable222);
            if (Intrinsics.areEqual(text, "ripple")) {
            }
            view.setBackground(rippleDrawable222);
        }
        view.setClickable(true);
        view.setFocusable(true);
        view.setOnClickListener(new View.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Function0.this.invoke();
            }
        });
    }

    public final TextView button(String label, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        TextView text$default = text$default(this, label, 13.0f, false, 0, 12, null);
        text$default.setGravity(17);
        text$default.setMinHeight(dp((Number) 44));
        text$default.setPadding(dp((Number) 16), dp((Number) 9), dp((Number) 16), dp((Number) 9));
        text$default.setBackground(surface$default(this, 0, false, 0.0f, 7, null));
        touch(text$default, onClick);
        return text$default;
    }

    public final FrameLayout iconButton(String glyph, String label, Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(glyph, "glyph");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        MainActivity mainActivity = this;
        FrameLayout frameLayout = new FrameLayout(mainActivity);
        frameLayout.setContentDescription(label);
        frameLayout.setMinimumWidth(dp((Number) 44));
        frameLayout.setMinimumHeight(dp((Number) 44));
        frameLayout.addView(new GlyphView(mainActivity, glyph, getMuted()), new FrameLayout.LayoutParams(dp((Number) 23), dp((Number) 23), 17));
        touch(frameLayout, onClick);
        return frameLayout;
    }

    public static /* synthetic */ void gap$default(MainActivity mainActivity, LinearLayout linearLayout, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 12;
        }
        mainActivity.gap(linearLayout, i);
    }

    public final void gap(LinearLayout parent, int n) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        parent.addView(new View(this), new LinearLayout.LayoutParams(1, dp(Integer.valueOf(n))));
    }

    public final void rule(LinearLayout parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        View view = new View(this);
        view.setBackgroundColor(getLine());
        parent.addView(view, new LinearLayout.LayoutParams(-1, dp((Number) 1)));
    }

    public final void toast(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Toast.makeText(this, message, 0).show();
    }

    private final void renderBase() {
        FrameLayout frameLayout;
        int i;
        ColorDrawable colorDrawable;
        LibraryScreen libraryScreen = this.library;
        if (libraryScreen != null) {
            this.libraryStates.put(this.activeSection, libraryScreen.snapshot());
        }
        this.library = null;
        if (this.base != null) {
            FrameLayout root = getRoot();
            LinearLayout linearLayout = this.base;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("base");
                linearLayout = null;
            }
            root.removeView(linearLayout);
        }
        LinearLayout column = column();
        this.base = column;
        if (column == null) {
            Intrinsics.throwUninitializedPropertyAccessException("base");
            column = null;
        }
        column.setBackgroundColor(getBg());
        FrameLayout root2 = getRoot();
        LinearLayout linearLayout2 = this.base;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("base");
            linearLayout2 = null;
        }
        root2.addView(linearLayout2, 0, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout row = row();
        row.setPadding(dp((Number) 16), dp((Number) 10), dp((Number) 12), dp((Number) 8));
        row.setMinimumHeight(dp((Number) 70));
        MainActivity mainActivity = this;
        EmblemView emblemView = new EmblemView(mainActivity, getAccent());
        emblemView.setFrost(isIce());
        emblemView.setRotationX(9.0f);
        emblemView.setCameraDistance(dp((Number) 180));
        emblemView.setContentDescription("Open 3D navigation");
        this.emblem = emblemView;
        row.addView(emblemView, new LinearLayout.LayoutParams(dp((Number) 40), dp((Number) 46)));
        EmblemView emblemView2 = this.emblem;
        if (emblemView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emblem");
            emblemView2 = null;
        }
        touch(emblemView2, new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit renderBase$lambda$2;
                renderBase$lambda$2 = MainActivity.renderBase$lambda$2(MainActivity.this);
                return renderBase$lambda$2;
            }
        });
        LinearLayout column2 = column();
        column2.setPadding(dp((Number) 9), 0, dp((Number) 4), 0);
        TextView text$default = text$default(this, "RESEARCH COMMISSION", 7.0f, false, getMuted(), 4, null);
        text$default.setLetterSpacing(0.2f);
        column2.addView(text$default);
        column2.addView(text$default(this, "Hunter’s Field Guide", getWide() ? 20.0f : 15.0f, true, 0, 8, null));
        LinearLayout linearLayout3 = column2;
        row.addView(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        touch(linearLayout3, new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda12
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit renderBase$lambda$4;
                renderBase$lambda$4 = MainActivity.renderBase$lambda$4(MainActivity.this);
                return renderBase$lambda$4;
            }
        });
        if (getWide() || !Intrinsics.areEqual(this.activeSection, "overview")) {
            row.addView(iconButton("search", "Search field book", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit renderBase$lambda$5;
                    renderBase$lambda$5 = MainActivity.renderBase$lambda$5(MainActivity.this);
                    return renderBase$lambda$5;
                }
            }), new LinearLayout.LayoutParams(dp((Number) 42), dp((Number) 44)));
        }
        row.addView(iconButton("bookmark", "Saved entries", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit renderBase$lambda$6;
                renderBase$lambda$6 = MainActivity.renderBase$lambda$6(MainActivity.this);
                return renderBase$lambda$6;
            }
        }), new LinearLayout.LayoutParams(dp((Number) 38), dp((Number) 44)));
        row.addView(iconButton("music", "Music controls", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit renderBase$lambda$7;
                renderBase$lambda$7 = MainActivity.renderBase$lambda$7(MainActivity.this);
                return renderBase$lambda$7;
            }
        }), new LinearLayout.LayoutParams(dp((Number) 38), dp((Number) 44)));
        row.addView(iconButton("settings", "Settings", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda16
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit renderBase$lambda$8;
                renderBase$lambda$8 = MainActivity.renderBase$lambda$8(MainActivity.this);
                return renderBase$lambda$8;
            }
        }), new LinearLayout.LayoutParams(dp((Number) 38), dp((Number) 44)));
        LinearLayout linearLayout4 = this.base;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("base");
            linearLayout4 = null;
        }
        linearLayout4.addView(row);
        LinearLayout linearLayout5 = this.base;
        if (linearLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("base");
            linearLayout5 = null;
        }
        rule(linearLayout5);
        LinearLayout row2 = row();
        int i2 = 1;
        for (Pair pair : (!Intrinsics.areEqual(this.activeSection, "progression") || worldComplete()) ? CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("world", "WORLD"), TuplesKt.to("iceborne", "ICEBORNE")}) : CollectionsKt.listOf(TuplesKt.to("world", "WORLD"))) {
            final String str = (String) pair.component1();
            String str2 = (String) pair.component2();
            boolean areEqual = Intrinsics.areEqual(this.edition, str);
            TextView button = button((areEqual ? "◆ " : "◇ ") + str2, new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit renderBase$lambda$9$0;
                    renderBase$lambda$9$0 = MainActivity.renderBase$lambda$9$0(MainActivity.this, str);
                    return renderBase$lambda$9$0;
                }
            });
            button.setTextColor(areEqual ? getAccent() : getMuted());
            button.setTextSize((getPrefs().number("font", 100) * 17.0f) / 100);
            button.setLetterSpacing(0.12f);
            if (areEqual) {
                i = i2;
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{getBg(), FieldViewsKt.blend(getBg(), getAccent(), 0.09f)});
                gradientDrawable.setStroke(dp(Integer.valueOf(i)), getLine());
                colorDrawable = gradientDrawable;
            } else {
                i = i2;
                colorDrawable = new ColorDrawable(getBg());
            }
            button.setBackground(colorDrawable);
            LinearLayout column3 = column();
            column3.addView(button, new LinearLayout.LayoutParams(-1, dp((Number) 60)));
            View view = new View(mainActivity);
            view.setBackgroundColor(areEqual ? getAccent() : getLine());
            column3.addView(view, new LinearLayout.LayoutParams(-1, dp(Integer.valueOf(areEqual ? 3 : i))));
            row2.addView(column3, new LinearLayout.LayoutParams(0, -2, 1.0f));
            i2 = i;
        }
        LinearLayout linearLayout6 = this.base;
        if (linearLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("base");
            linearLayout6 = null;
        }
        linearLayout6.addView(row2);
        this.content = new FrameLayout(mainActivity);
        LinearLayout linearLayout7 = this.base;
        if (linearLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("base");
            linearLayout7 = null;
        }
        FrameLayout frameLayout2 = this.content;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("content");
            frameLayout = null;
        } else {
            frameLayout = frameLayout2;
        }
        linearLayout7.addView(frameLayout, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        renderSection();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderBase$lambda$2(MainActivity mainActivity) {
        mainActivity.showMenu();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderBase$lambda$4(MainActivity mainActivity) {
        if (!Intrinsics.areEqual(mainActivity.activeSection, "overview")) {
            navigate$default(mainActivity, "overview", false, 2, null);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderBase$lambda$5(MainActivity mainActivity) {
        showSearch$default(mainActivity, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderBase$lambda$6(MainActivity mainActivity) {
        mainActivity.showSaved();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderBase$lambda$7(MainActivity mainActivity) {
        mainActivity.showSettings("Music");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderBase$lambda$8(MainActivity mainActivity) {
        showSettings$default(mainActivity, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit renderBase$lambda$9$0(MainActivity mainActivity, String str) {
        mainActivity.switchEdition(str);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void navigate$default(MainActivity mainActivity, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        mainActivity.navigate(str, z);
    }

    public final void navigate(String section, boolean remember) {
        Intrinsics.checkNotNullParameter(section, "section");
        LibraryScreen libraryScreen = this.library;
        if (libraryScreen != null) {
            this.libraryStates.put(this.activeSection, libraryScreen.snapshot());
        }
        FieldAudio fieldAudio = null;
        this.library = null;
        if (Intrinsics.areEqual(section, "progression") && !worldComplete() && Intrinsics.areEqual(this.edition, "iceborne")) {
            this.edition = "world";
            getPrefs().set("edition", this.edition);
            FieldAudio fieldAudio2 = this.audio;
            if (fieldAudio2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audio");
            } else {
                fieldAudio = fieldAudio2;
            }
            fieldAudio.play(this.edition);
        }
        if (remember && !Intrinsics.areEqual(section, this.activeSection)) {
            this.sectionHistory.addLast(this.activeSection);
        }
        this.activeSection = section;
        getPrefs().set("lastSection", section);
        renderBase();
    }

    private final void renderSection() {
        LibraryScreen libraryScreen = this.library;
        if (libraryScreen != null) {
            this.libraryStates.put(this.activeSection, libraryScreen.snapshot());
        }
        FrameLayout frameLayout = null;
        this.library = null;
        FrameLayout frameLayout2 = this.content;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("content");
            frameLayout2 = null;
        }
        frameLayout2.removeAllViews();
        String str = this.activeSection;
        if (Intrinsics.areEqual(str, "overview")) {
            overview();
            return;
        }
        if (!Intrinsics.areEqual(str, "progression")) {
            String str2 = this.activeSection;
            this.library = new LibraryScreen(this, str2, this.libraryStates.get(str2));
            FrameLayout frameLayout3 = this.content;
            if (frameLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("content");
            } else {
                frameLayout = frameLayout3;
            }
            frameLayout.addView(this.library, new FrameLayout.LayoutParams(-1, -1));
            return;
        }
        if (!worldComplete() && Intrinsics.areEqual(this.edition, "iceborne")) {
            switchEdition("world");
            return;
        }
        FrameLayout frameLayout4 = this.content;
        if (frameLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("content");
        } else {
            frameLayout = frameLayout4;
        }
        frameLayout.addView(new ProgressScreen(this), new FrameLayout.LayoutParams(-1, -1));
    }

    public final void refreshCurrentSection() {
        FrameLayout frameLayout = this.content;
        if (frameLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("content");
            frameLayout = null;
        }
        View childAt = frameLayout.getChildAt(0);
        ScrollView scrollView = childAt instanceof ScrollView ? (ScrollView) childAt : null;
        final int scrollY = scrollView != null ? scrollView.getScrollY() : 0;
        renderBase();
        FrameLayout frameLayout2 = this.content;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("content");
            frameLayout2 = null;
        }
        View childAt2 = frameLayout2.getChildAt(0);
        final ScrollView scrollView2 = childAt2 instanceof ScrollView ? (ScrollView) childAt2 : null;
        if (scrollView2 != null) {
            scrollView2.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda55
                @Override // java.lang.Runnable
                public final void run() {
                    scrollView2.scrollTo(0, scrollY);
                }
            });
        }
    }

    public final void replaceLibraryState(String section, JSONObject state) {
        Intrinsics.checkNotNullParameter(section, "section");
        Intrinsics.checkNotNullParameter(state, "state");
        this.library = null;
        this.libraryStates.put(section, state);
    }

    public final boolean worldComplete() {
        RouteProgress routeProgress = RouteProgress.INSTANCE;
        JSONArray jSONArray = getLibraryData().getJSONObject("speedrun").getJSONArray("world");
        Intrinsics.checkNotNullExpressionValue(jSONArray, "getJSONArray(...)");
        return routeProgress.completeAll(jSONArray, RouteProgress.INSTANCE.state(getPrefs(), "world"));
    }

    public final void switchEdition(String next) {
        Intrinsics.checkNotNullParameter(next, "next");
        if (Intrinsics.areEqual(this.edition, next)) {
            return;
        }
        if (Intrinsics.areEqual(this.activeSection, "progression") && Intrinsics.areEqual(next, "iceborne") && !worldComplete()) {
            return;
        }
        this.edition = next;
        getPrefs().set("edition", next);
        FieldAudio fieldAudio = this.audio;
        if (fieldAudio == null) {
            Intrinsics.throwUninitializedPropertyAccessException("audio");
            fieldAudio = null;
        }
        fieldAudio.play(next);
        renderBase();
    }

    public final void loadBitmap(final String path, final Function1<? super Bitmap, Unit> callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Bitmap bitmap = get(path);
        if (bitmap != null) {
            callback.invoke(bitmap);
        } else {
            this.images.execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda25
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.loadBitmap$lambda$1(MainActivity.this, path, callback);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBitmap$lambda$1(final MainActivity mainActivity, String str, final Function1 function1) {
        Object m65constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream open = mainActivity.getAssets().open(str);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(open);
                CloseableKt.closeFinally(open, null);
                m65constructorimpl = Result.m65constructorimpl(decodeStream);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th));
        }
        final Bitmap bitmap = (Bitmap) (Result.m71isFailureimpl(m65constructorimpl) ? null : m65constructorimpl);
        if (bitmap != null) {
            mainActivity.cache.put(str, bitmap);
        }
        mainActivity.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda51
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.loadBitmap$lambda$1$1(MainActivity.this, function1, bitmap);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBitmap$lambda$1$1(MainActivity mainActivity, Function1 function1, Bitmap bitmap) {
        if (mainActivity.destroyed) {
            return;
        }
        function1.invoke(bitmap);
    }

    public final void assetImage(final String path, final ImageView view) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(view, "view");
        view.setTag(path);
        Bitmap bitmap = get(path);
        if (bitmap != null) {
            view.setImageBitmap(bitmap);
        } else {
            this.images.execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda53
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.assetImage$lambda$1(MainActivity.this, path, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void assetImage$lambda$1(final MainActivity mainActivity, final String str, final ImageView imageView) {
        Object m65constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            InputStream open = mainActivity.getAssets().open(str);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(open);
                CloseableKt.closeFinally(open, null);
                m65constructorimpl = Result.m65constructorimpl(decodeStream);
            } finally {
            }
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th));
        }
        final Bitmap bitmap = (Bitmap) (Result.m71isFailureimpl(m65constructorimpl) ? null : m65constructorimpl);
        if (bitmap != null) {
            mainActivity.cache.put(str, bitmap);
            mainActivity.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda36
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.assetImage$lambda$1$1(MainActivity.this, imageView, str, bitmap);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void assetImage$lambda$1$1(MainActivity mainActivity, ImageView imageView, String str, Bitmap bitmap) {
        if (mainActivity.destroyed || !Intrinsics.areEqual(imageView.getTag(), str)) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    private final void overview() {
        MainActivity mainActivity = this;
        FrameLayout frameLayout = new FrameLayout(mainActivity);
        FrameLayout frameLayout2 = this.content;
        if (frameLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("content");
            frameLayout2 = null;
        }
        frameLayout2.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        ImageView imageView = new ImageView(mainActivity);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setContentDescription(isIce() ? "Iceborne complete key artwork" : "World complete key artwork");
        frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
        assetImage("art/" + this.edition + "-hero.webp", imageView);
        View view = new View(mainActivity);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{FieldViewsKt.alphaColour(getBg(), 20), FieldViewsKt.alphaColour(getBg(), 0), FieldViewsKt.alphaColour(getBg(), 100)}));
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        LinearLayout column = column();
        column.setGravity(17);
        column.setPadding(dp((Number) 20), 0, dp((Number) 20), 0);
        ImageView imageView2 = new ImageView(mainActivity);
        imageView2.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView2.setContentDescription(isIce() ? "Monster Hunter World Iceborne logo" : "Monster Hunter World logo");
        column.addView(imageView2, new LinearLayout.LayoutParams(dp(Integer.valueOf(getWide() ? 390 : 290)), dp(Integer.valueOf(getWide() ? 148 : 118))));
        assetImage("art/" + this.edition + "-logo.webp", imageView2);
        gap(column, 12);
        TextView text$default = text$default(this, isIce() ? "Into the frost" : "A new world", getWide() ? 32.0f : 27.0f, true, 0, 8, null);
        text$default.setGravity(17);
        text$default.setShadowLayer(5.0f, 1.0f, 2.0f, -16777216);
        column.addView(text$default);
        TextView text$default2 = text$default(this, isIce() ? "Beyond your limits" : "A hunter’s calling", getWide() ? 34.0f : 28.0f, false, getAccent(), 4, null);
        text$default2.setGravity(17);
        text$default2.setShadowLayer(5.0f, 1.0f, 2.0f, -16777216);
        column.addView(text$default2);
        gap(column, 24);
        FrameLayout frameLayout3 = new FrameLayout(mainActivity);
        frameLayout3.addView(new HaloView(mainActivity, getAccent(), getPrefs()), new FrameLayout.LayoutParams(-1, -1));
        final FrameLayout iconButton = iconButton("search", "Search monsters, weapons, equipment and items", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit overview$lambda$5;
                overview$lambda$5 = MainActivity.overview$lambda$5(MainActivity.this);
                return overview$lambda$5;
            }
        });
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TL_BR, new int[]{FieldViewsKt.blend(getBg(), getAccent(), 0.16f), getBg()});
        gradientDrawable.setShape(1);
        gradientDrawable.setStroke(dp((Number) 1), getAccent());
        iconButton.setBackground(gradientDrawable);
        FrameLayout frameLayout4 = iconButton;
        touch(frameLayout4, new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda29
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit overview$lambda$7;
                overview$lambda$7 = MainActivity.overview$lambda$7(iconButton, this);
                return overview$lambda$7;
            }
        });
        frameLayout3.addView(frameLayout4, new FrameLayout.LayoutParams(dp((Number) 68), dp((Number) 68), 17));
        column.addView(frameLayout3, new LinearLayout.LayoutParams(dp((Number) 140), dp((Number) 118)));
        frameLayout.addView(column, new FrameLayout.LayoutParams(-1, -2, 17));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit overview$lambda$5(MainActivity mainActivity) {
        showSearch$default(mainActivity, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit overview$lambda$7(final FrameLayout frameLayout, final MainActivity mainActivity) {
        frameLayout.animate().scaleX(1.16f).scaleY(1.16f).setDuration(mainActivity.motionDuration(110L)).withEndAction(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda52
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.overview$lambda$7$0(frameLayout, mainActivity);
            }
        }).start();
        showSearch$default(mainActivity, null, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void overview$lambda$7$0(FrameLayout frameLayout, MainActivity mainActivity) {
        frameLayout.animate().scaleX(1.0f).scaleY(1.0f).setDuration(mainActivity.motionDuration(220L)).start();
    }

    public final void afterPreference(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        FieldAudio fieldAudio = null;
        if (CollectionsKt.listOf((Object[]) new String[]{"musicEnabled", "volume", "followTheme", "musicMode", "rememberMusicPosition"}).contains(key)) {
            FieldAudio fieldAudio2 = this.audio;
            if (fieldAudio2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audio");
                fieldAudio2 = null;
            }
            fieldAudio2.play(this.edition);
            FieldAudio fieldAudio3 = this.audio;
            if (fieldAudio3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audio");
            } else {
                fieldAudio = fieldAudio3;
            }
            fieldAudio.updateVolume();
            return;
        }
        if (Intrinsics.areEqual(key, "reset")) {
            FieldAudio fieldAudio4 = this.audio;
            if (fieldAudio4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audio");
                fieldAudio4 = null;
            }
            fieldAudio4.play(this.edition);
            FieldAudio fieldAudio5 = this.audio;
            if (fieldAudio5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audio");
            } else {
                fieldAudio = fieldAudio5;
            }
            fieldAudio.updateVolume();
        }
        renderBase();
        Iterator<T> it = this.overlays.iterator();
        while (it.hasNext()) {
            ((Overlay) it.next()).getContainer().setBackgroundColor(FieldViewsKt.alphaColour(getBg(), 190));
        }
    }

    public final void clearSearchHistory() {
        this.recent = new JSONArray();
        getPrefs().set("recent", "[]");
        if (this.queryInput != null) {
            runSearch();
        }
    }

    private final void showIntro() {
        MainActivity mainActivity = this;
        final FrameLayout frameLayout = new FrameLayout(mainActivity);
        frameLayout.setBackgroundColor(getBg());
        getRoot().addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        this.introView = frameLayout;
        LinearLayout column = column();
        column.setGravity(17);
        final EmblemView emblemView = new EmblemView(mainActivity, getAccent());
        emblemView.setFormation(0.0f);
        emblemView.setRotationX(9.0f);
        emblemView.setRotationY(-65.0f);
        emblemView.setCameraDistance(dp((Number) 700));
        emblemView.setContentDescription("Forming snowflake introduction");
        column.addView(emblemView, new LinearLayout.LayoutParams(dp((Number) 138), dp((Number) 150)));
        gap(column, 22);
        TextView text$default = text$default(this, "MONSTER HUNTER", 12.0f, false, getAccent(), 4, null);
        text$default.setLetterSpacing(0.24f);
        text$default.setGravity(17);
        column.addView(text$default);
        TextView text$default2 = text$default(this, "Field Book", 27.0f, true, 0, 8, null);
        text$default2.setGravity(17);
        column.addView(text$default2);
        frameLayout.addView(column, new FrameLayout.LayoutParams(-1, -2, 17));
        frameLayout.post(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.showIntro$lambda$3(MainActivity.this, emblemView, frameLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showIntro$lambda$3(MainActivity mainActivity, final EmblemView emblemView, FrameLayout frameLayout) {
        if (mainActivity.destroyed) {
            return;
        }
        mainActivity.introStarted = true;
        if (mainActivity.foreground) {
            FieldAudio fieldAudio = mainActivity.audio;
            if (fieldAudio == null) {
                Intrinsics.throwUninitializedPropertyAccessException("audio");
                fieldAudio = null;
            }
            fieldAudio.formation();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(3000L);
        ofFloat.setInterpolator(new DecelerateInterpolator());
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda18
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                MainActivity.showIntro$lambda$3$0$0(EmblemView.this, valueAnimator);
            }
        });
        ofFloat.addListener(new MainActivity$showIntro$3$1$2(mainActivity, frameLayout));
        ofFloat.start();
        mainActivity.introAnimator = ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showIntro$lambda$3$0$0(EmblemView emblemView, ValueAnimator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = ((Float) animatedValue).floatValue();
        emblemView.setFormation(RangesKt.coerceAtMost(1.25f * floatValue, 1.0f));
        emblemView.setRotationY((-65) + (65 * floatValue));
        emblemView.setAlpha((floatValue * 0.7f) + 0.3f);
    }

    /* compiled from: MainActivity.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0005H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/lumina/monsterhunterfieldbook/MainActivity$BoundPanel;", "Lcom/lumina/monsterhunterfieldbook/RevealFrame;", "<init>", "(Lcom/lumina/monsterhunterfieldbook/MainActivity;)V", "capWidth", "", "getCapWidth", "()I", "setCapWidth", "(I)V", "fill", "", "getFill", "()Z", "setFill", "(Z)V", "onMeasure", "", "w", "h", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private final class BoundPanel extends RevealFrame {
        private int capWidth;
        private boolean fill;

        public BoundPanel() {
            super(MainActivity.this);
            this.capWidth = 840;
        }

        public final int getCapWidth() {
            return this.capWidth;
        }

        public final void setCapWidth(int i) {
            this.capWidth = i;
        }

        public final boolean getFill() {
            return this.fill;
        }

        public final void setFill(boolean z) {
            this.fill = z;
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int w, int h) {
            int min = Math.min(View.MeasureSpec.getSize(w), MainActivity.this.dp(Integer.valueOf(this.capWidth)));
            int dp = MainActivity.this.dp((Number) 80);
            int size = View.MeasureSpec.getSize(h);
            MainActivity mainActivity = MainActivity.this;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, this.fill ? 1073741824 : Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(Math.max(dp, size - mainActivity.dp(Integer.valueOf(mainActivity.getLandscape() ? 16 : 36))), this.fill ? 1073741824 : Integer.MIN_VALUE));
        }
    }

    static /* synthetic */ View present$default(MainActivity mainActivity, String str, View view, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 840;
        }
        if ((i2 & 8) != 0) {
            z = false;
        }
        return mainActivity.present(str, view, i, z);
    }

    private final View present(String kind, View body, int width, boolean menu) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setBackgroundColor(FieldViewsKt.alphaColour(getBg(), 205));
        frameLayout.setClickable(true);
        BoundPanel boundPanel = new BoundPanel();
        boundPanel.setCapWidth(width);
        boundPanel.setBackground(surface$default(this, 0, false, 0.0f, 7, null));
        boundPanel.setElevation(dp((Number) 12));
        boundPanel.setClickable(true);
        boundPanel.setFill(CollectionsKt.listOf((Object[]) new String[]{"search", "settings", "record", "saved", "credits", "checklist"}).contains(kind));
        boundPanel.addView(body, new FrameLayout.LayoutParams(-1, boundPanel.getFill() ? -1 : -2));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, boundPanel.getFill() ? -1 : -2, menu ? 8388659 : 17);
        layoutParams.setMargins(dp((Number) 12), dp(Integer.valueOf(menu ? 80 : 12)), dp((Number) 12), dp((Number) 12));
        BoundPanel boundPanel2 = boundPanel;
        frameLayout.addView(boundPanel2, layoutParams);
        this.overlays.add(new Overlay(kind, frameLayout, boundPanel2, false, 8, null));
        FrameLayout frameLayout2 = frameLayout;
        getRoot().addView(frameLayout2, new FrameLayout.LayoutParams(-1, -1));
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda45
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.this.dismiss();
            }
        });
        boundPanel.setOnClickListener(new View.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda46
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.present$lambda$1(view);
            }
        });
        enter(boundPanel2, frameLayout2);
        return boundPanel2;
    }

    private final void enter(View view, View container) {
        long motionDuration = motionDuration(340L);
        if (motionDuration == 0 || Intrinsics.areEqual(getPrefs().text("transition", "liquid"), "none")) {
            return;
        }
        container.setAlpha(0.0f);
        container.animate().alpha(1.0f).setDuration(motionDuration).start();
        String text = getPrefs().text("transition", "liquid");
        if (text != null) {
            int hashCode = text.hashCode();
            if (hashCode == -1102567108) {
                if (text.equals("liquid")) {
                    final RevealFrame revealFrame = view instanceof RevealFrame ? (RevealFrame) view : null;
                    if (revealFrame != null) {
                        revealFrame.setReveal(0.0f);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                        ofFloat.setDuration(motionDuration);
                        ofFloat.setInterpolator(new PathInterpolator(0.22f, 0.75f, 0.3f, 1.0f));
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda44
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                MainActivity.enter$lambda$0$0$0(RevealFrame.this, valueAnimator);
                            }
                        });
                        ofFloat.start();
                        return;
                    }
                    return;
                }
                return;
            }
            if (hashCode != 3744723) {
                if (hashCode == 109526449 && text.equals("slide")) {
                    view.setTranslationY(dp((Number) 28));
                    view.animate().translationY(0.0f).setDuration(motionDuration).start();
                    return;
                }
                return;
            }
            if (text.equals("zoom")) {
                view.setScaleX(0.91f);
                view.setScaleY(0.91f);
                view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(motionDuration).start();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enter$lambda$0$0$0(RevealFrame revealFrame, ValueAnimator a) {
        Intrinsics.checkNotNullParameter(a, "a");
        Object animatedValue = a.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        revealFrame.setReveal(((Float) animatedValue).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dismiss() {
        final Overlay overlay = (Overlay) CollectionsKt.lastOrNull((List) this.overlays);
        if (overlay == null || overlay.getClosing()) {
            return;
        }
        overlay.setClosing(true);
        EmblemView emblemView = null;
        if (Intrinsics.areEqual(overlay.getKind(), "search")) {
            hideKeyboard();
            this.searchGeneration.incrementAndGet();
            this.queryInput = null;
            this.resultBody = null;
            this.resultScroll = null;
        }
        if (Intrinsics.areEqual(overlay.getKind(), "menu")) {
            EmblemView emblemView2 = this.emblem;
            if (emblemView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("emblem");
            } else {
                emblemView = emblemView2;
            }
            emblemView.animate().rotationY(0.0f).setDuration(motionDuration(380L)).start();
        }
        final Function0 function0 = new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda38
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit dismiss$lambda$0;
                dismiss$lambda$0 = MainActivity.dismiss$lambda$0(MainActivity.this, overlay);
                return dismiss$lambda$0;
            }
        };
        long motionDuration = motionDuration(240L);
        if (motionDuration == 0 || Intrinsics.areEqual(getPrefs().text("transition", "liquid"), "none")) {
            function0.invoke();
        } else {
            overlay.getContainer().animate().alpha(0.0f).setDuration(motionDuration).withEndAction(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda39
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.invoke();
                }
            }).start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dismiss$lambda$0(MainActivity mainActivity, Overlay overlay) {
        mainActivity.getRoot().removeView(overlay.getContainer());
        mainActivity.overlays.remove(overlay);
        if (Intrinsics.areEqual(overlay.getKind(), "settings")) {
            mainActivity.settings = null;
        }
        return Unit.INSTANCE;
    }

    private final LinearLayout heading(String title, Function0<Unit> close) {
        LinearLayout row = row();
        row.setPadding(dp((Number) 18), dp((Number) 14), dp((Number) 12), dp((Number) 14));
        row.addView(text$default(this, title, 25.0f, true, 0, 8, null), new LinearLayout.LayoutParams(0, -2, 1.0f));
        row.addView(iconButton("close", "Close " + title, close), new LinearLayout.LayoutParams(dp((Number) 44), dp((Number) 44)));
        return row;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ LinearLayout heading$default(final MainActivity mainActivity, String str, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda49
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit heading$lambda$0;
                    heading$lambda$0 = MainActivity.heading$lambda$0(MainActivity.this);
                    return heading$lambda$0;
                }
            };
        }
        return mainActivity.heading(str, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit heading$lambda$0(MainActivity mainActivity) {
        mainActivity.dismiss();
        return Unit.INSTANCE;
    }

    private final void showMenu() {
        Overlay overlay = (Overlay) CollectionsKt.lastOrNull((List) this.overlays);
        if (Intrinsics.areEqual(overlay != null ? overlay.getKind() : null, "menu")) {
            dismiss();
            return;
        }
        EmblemView emblemView = this.emblem;
        if (emblemView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("emblem");
            emblemView = null;
        }
        emblemView.animate().rotationY(180.0f).setDuration(motionDuration(380L)).start();
        LinearLayout column = column();
        column.addView(heading$default(this, "Field Guide", null, 2, null));
        rule(column);
        ScrollView scrollView = new ScrollView(this);
        LinearLayout column2 = column();
        LinearLayout linearLayout = column2;
        pad(linearLayout, 7);
        scrollView.addView(linearLayout);
        Iterator<T> it = this.sections.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            final String str = (String) pair.component1();
            TextView button = button((String) pair.component2(), new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit showMenu$lambda$0$0;
                    showMenu$lambda$0$0 = MainActivity.showMenu$lambda$0$0(MainActivity.this, str);
                    return showMenu$lambda$0$0;
                }
            });
            button.setGravity(8388627);
            button.setTextColor(Intrinsics.areEqual(str, this.activeSection) ? getAccent() : getMuted());
            column2.addView(button, new LinearLayout.LayoutParams(-1, dp((Number) 44)));
        }
        column2.addView(button("Sources & credits", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showMenu$lambda$1;
                showMenu$lambda$1 = MainActivity.showMenu$lambda$1(MainActivity.this);
                return showMenu$lambda$1;
            }
        }));
        column.addView(scrollView);
        present("menu", column, 340, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showMenu$lambda$0$0(MainActivity mainActivity, String str) {
        mainActivity.dismiss();
        navigate$default(mainActivity, str, false, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showMenu$lambda$1(MainActivity mainActivity) {
        mainActivity.dismiss();
        mainActivity.showCredits();
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void showSettings$default(MainActivity mainActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "Appearance";
        }
        mainActivity.showSettings(str);
    }

    public final void showSettings(String category) {
        Intrinsics.checkNotNullParameter(category, "category");
        Overlay overlay = (Overlay) CollectionsKt.lastOrNull((List) this.overlays);
        if (Intrinsics.areEqual(overlay != null ? overlay.getKind() : null, "settings")) {
            return;
        }
        LinearLayout column = column();
        SettingsPanel settingsPanel = new SettingsPanel(this, column, category);
        this.settings = settingsPanel;
        Intrinsics.checkNotNull(settingsPanel);
        settingsPanel.rebuild();
        present$default(this, "settings", column, (Intrinsics.areEqual(getPrefs().text("settingsLayout", "center"), "split") && getWide()) ? 1000 : 840, false, 8, null);
    }

    public final void closeTop() {
        dismiss();
    }

    public final void rebuildSettings() {
        SettingsPanel settingsPanel = this.settings;
        if (settingsPanel != null) {
            settingsPanel.rebuild();
        }
    }

    public final LinearLayout settingsHeading(String title) {
        Intrinsics.checkNotNullParameter(title, "title");
        return heading$default(this, title, null, 2, null);
    }

    public static /* synthetic */ void showSearch$default(MainActivity mainActivity, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        mainActivity.showSearch(str);
    }

    public final void showSearch(String kind) {
        Overlay overlay = (Overlay) CollectionsKt.lastOrNull((List) this.overlays);
        Typeface typeface = null;
        if (Intrinsics.areEqual(overlay != null ? overlay.getKind() : null, "search")) {
            return;
        }
        if (kind != null) {
            this.searchKind = kind;
        }
        LinearLayout column = column();
        LinearLayout row = row();
        row.setPadding(dp((Number) 14), dp((Number) 10), dp((Number) 7), dp((Number) 10));
        MainActivity mainActivity = this;
        final EditText editText = new EditText(mainActivity);
        editText.setSingleLine(true);
        editText.setHint("Search");
        editText.setContentDescription("Search both World and Iceborne");
        editText.setTextSize((getPrefs().number("font", 100) * 17.0f) / 100.0f);
        Typeface typeface2 = this.bodyFont;
        if (typeface2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bodyFont");
        } else {
            typeface = typeface2;
        }
        editText.setTypeface(typeface);
        editText.setTextColor(getInk());
        editText.setHintTextColor(getMuted());
        editText.setBackground(new ColorDrawable(0));
        editText.setInputType(16385);
        editText.setImeOptions(3);
        editText.setText(this.searchQuery);
        editText.setSelection(editText.length());
        this.queryInput = editText;
        row.addView(editText, new LinearLayout.LayoutParams(0, dp((Number) 48), 1.0f));
        row.addView(iconButton("close", "Clear search", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showSearch$lambda$1;
                showSearch$lambda$1 = MainActivity.showSearch$lambda$1(editText);
                return showSearch$lambda$1;
            }
        }), new LinearLayout.LayoutParams(dp((Number) 46), dp((Number) 48)));
        row.addView(iconButton("back", "Close search", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda20
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showSearch$lambda$2;
                showSearch$lambda$2 = MainActivity.showSearch$lambda$2(MainActivity.this);
                return showSearch$lambda$2;
            }
        }), new LinearLayout.LayoutParams(dp((Number) 44), dp((Number) 48)));
        column.addView(row);
        rule(column);
        TextView text$default = text$default(this, "WORLD + ICEBORNE · OFFLINE", 10.0f, false, getAccent(), 4, null);
        text$default.setPadding(dp((Number) 18), dp((Number) 9), dp((Number) 12), dp((Number) 9));
        text$default.setLetterSpacing(0.12f);
        column.addView(text$default);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(mainActivity);
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        final LinearLayout row2 = row();
        row2.setPadding(dp((Number) 10), 0, dp((Number) 10), dp((Number) 8));
        horizontalScrollView.addView(row2);
        final List<String> listOf = CollectionsKt.listOf((Object[]) new String[]{"All", "Monsters", "Weapons", "Weapon Guides", "Equipment", "Builds", "Items", "Recipes", "Preparation", "Quests", "Locales", "Maps", "Field Notes", "Creatures"});
        for (final String str : listOf) {
            TextView button = button(str, new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit showSearch$lambda$4$0;
                    showSearch$lambda$4$0 = MainActivity.showSearch$lambda$4$0(MainActivity.this, str, row2, listOf);
                    return showSearch$lambda$4$0;
                }
            });
            button.setTextColor(Intrinsics.areEqual(str, this.searchKind) ? getAccent() : getMuted());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, dp((Number) 40));
            layoutParams.setMarginEnd(dp((Number) 6));
            row2.addView(button, layoutParams);
        }
        column.addView(horizontalScrollView);
        rule(column);
        this.resultScroll = new ScrollView(mainActivity);
        LinearLayout column2 = column();
        this.resultBody = column2;
        Intrinsics.checkNotNull(column2);
        column2.setPadding(dp((Number) 10), dp((Number) 6), dp((Number) 10), dp((Number) 16));
        ScrollView scrollView = this.resultScroll;
        Intrinsics.checkNotNull(scrollView);
        scrollView.addView(this.resultBody);
        column.addView(this.resultScroll, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        present$default(this, "search", column, 900, false, 8, null);
        editText.addTextChangedListener(new TextWatcher() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$showSearch$5
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                MainActivity.this.searchQuery = String.valueOf(s);
                MainActivity.this.searchRelated = false;
                MainActivity.this.runSearch();
            }
        });
        runSearch();
        editText.requestFocus();
        editText.postDelayed(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda23
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.showSearch$lambda$5(MainActivity.this, editText);
            }
        }, 250L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSearch$lambda$1(EditText editText) {
        editText.setText("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSearch$lambda$2(MainActivity mainActivity) {
        mainActivity.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showSearch$lambda$4$0(MainActivity mainActivity, String str, LinearLayout linearLayout, List list) {
        mainActivity.searchKind = str;
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setTextColor(Intrinsics.areEqual(list.get(i), str) ? mainActivity.getAccent() : mainActivity.getMuted());
        }
        mainActivity.runSearch();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSearch$lambda$5(MainActivity mainActivity, EditText editText) {
        if (mainActivity.destroyed || !editText.isAttachedToWindow()) {
            return;
        }
        Overlay overlay = (Overlay) CollectionsKt.lastOrNull((List) mainActivity.overlays);
        if (Intrinsics.areEqual(overlay != null ? overlay.getKind() : null, "search")) {
            Object systemService = mainActivity.getSystemService("input_method");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((InputMethodManager) systemService).showSoftInput(editText, 1);
        }
    }

    private final void hideKeyboard() {
        Object systemService = getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(getRoot().getWindowToken(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void runSearch() {
        final LinearLayout linearLayout = this.resultBody;
        if (linearLayout == null) {
            return;
        }
        final int incrementAndGet = this.searchGeneration.incrementAndGet();
        final String obj = StringsKt.trim((CharSequence) this.searchQuery).toString();
        final String str = this.searchKind;
        linearLayout.removeAllViews();
        if (StringsKt.isBlank(obj)) {
            if (getHistoryEnabled() && this.recent.length() > 0) {
                LinearLayout row = row();
                row.addView(text$default(this, "Recent searches", 15.0f, false, 0, 12, null), new LinearLayout.LayoutParams(0, -2, 1.0f));
                row.addView(button("Clear", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda30
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit runSearch$lambda$0;
                        runSearch$lambda$0 = MainActivity.runSearch$lambda$0(MainActivity.this);
                        return runSearch$lambda$0;
                    }
                }));
                linearLayout.addView(row);
                int length = this.recent.length();
                for (int i = 0; i < length; i++) {
                    final String optString = this.recent.optString(i);
                    LinearLayout row2 = row();
                    Intrinsics.checkNotNull(optString);
                    row2.addView(button(optString, new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda31
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit runSearch$lambda$1;
                            runSearch$lambda$1 = MainActivity.runSearch$lambda$1(MainActivity.this, optString);
                            return runSearch$lambda$1;
                        }
                    }), new LinearLayout.LayoutParams(0, -2, 1.0f));
                    row2.addView(iconButton("close", "Remove " + optString + " from history", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda32
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit runSearch$lambda$2;
                            runSearch$lambda$2 = MainActivity.runSearch$lambda$2(MainActivity.this, optString);
                            return runSearch$lambda$2;
                        }
                    }), new LinearLayout.LayoutParams(dp((Number) 44), dp((Number) 44)));
                    linearLayout.addView(row2);
                }
                return;
            }
            TextView text$default = text$default(this, "Search names, partial names or equipment attributes.\nTry “Rathalos”, “Potion” or “fire great sword”.", 14.0f, false, getMuted(), 4, null);
            text$default.setPadding(dp((Number) 12), dp((Number) 20), dp((Number) 12), dp((Number) 16));
            linearLayout.addView(text$default);
            return;
        }
        if (!this.ready) {
            linearLayout.addView(text$default(this, "Preparing offline search…", 14.0f, false, getMuted(), 4, null));
        } else {
            linearLayout.addView(text$default(this, "Searching…", 13.0f, false, getMuted(), 4, null));
            getCatalogue().getExecutor().execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda34
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.runSearch$lambda$4(incrementAndGet, this, obj, str, linearLayout);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runSearch$lambda$0(MainActivity mainActivity) {
        mainActivity.recent = new JSONArray();
        mainActivity.getPrefs().set("recent", "[]");
        mainActivity.runSearch();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runSearch$lambda$1(MainActivity mainActivity, String str) {
        EditText editText = mainActivity.queryInput;
        if (editText != null) {
            editText.setText(str);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runSearch$lambda$2(MainActivity mainActivity, String str) {
        IntRange until = RangesKt.until(0, mainActivity.recent.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(mainActivity.recent.getString(((IntIterator) it).nextInt()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!Intrinsics.areEqual((String) obj, str)) {
                arrayList2.add(obj);
            }
        }
        mainActivity.recent = new JSONArray((Collection) arrayList2);
        NativePrefs prefs = mainActivity.getPrefs();
        String jSONArray = mainActivity.recent.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
        prefs.set("recent", jSONArray);
        mainActivity.runSearch();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runSearch$lambda$4(final int i, final MainActivity mainActivity, String str, String str2, final LinearLayout linearLayout) {
        final Object m65constructorimpl;
        if (i != mainActivity.searchGeneration.get()) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(mainActivity.getCatalogue().search(str, str2, mainActivity.searchRelated));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th));
        }
        mainActivity.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda24
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.runSearch$lambda$4$1(MainActivity.this, i, linearLayout, m65constructorimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void runSearch$lambda$4$1(MainActivity mainActivity, int i, LinearLayout linearLayout, Object obj) {
        MainActivity mainActivity2;
        String str;
        if (!mainActivity.destroyed && i == mainActivity.searchGeneration.get() && linearLayout == mainActivity.resultBody) {
            linearLayout.removeAllViews();
            if (Result.m68exceptionOrNullimpl(obj) != null) {
                mainActivity2 = mainActivity;
                linearLayout.addView(text$default(mainActivity2, "Search could not finish. Try another name.", 14.0f, false, mainActivity.getMuted(), 4, null));
            } else {
                mainActivity2 = mainActivity;
            }
            if (Result.m72isSuccessimpl(obj)) {
                List list = (List) obj;
                if (list.isEmpty()) {
                    str = "No matching records. Try a shorter name.";
                } else {
                    str = list.size() + (list.size() == 100 ? "+" : "") + " results" + (mainActivity2.searchRelated ? " · related records" : "");
                }
                TextView text$default = text$default(mainActivity2, str, 12.0f, false, mainActivity2.getMuted(), 4, null);
                text$default.setPadding(mainActivity2.dp((Number) 10), mainActivity2.dp((Number) 10), 0, mainActivity2.dp((Number) 10));
                linearLayout.addView(text$default);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    String kind = ((FieldRecord) obj2).getKind();
                    Object obj3 = linkedHashMap.get(kind);
                    if (obj3 == null) {
                        obj3 = (List) new ArrayList();
                        linkedHashMap.put(kind, obj3);
                    }
                    ((List) obj3).add(obj2);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    String upperCase = str2.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                    TextView text$default2 = text$default(mainActivity2, upperCase, 10.0f, false, mainActivity2.getAccent(), 4, null);
                    text$default2.setLetterSpacing(0.14f);
                    text$default2.setPadding(mainActivity2.dp((Number) 10), mainActivity2.dp((Number) 14), 0, mainActivity2.dp((Number) 8));
                    linearLayout.addView(text$default2);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        linearLayout.addView(recordRow$default(mainActivity2, (FieldRecord) it.next(), null, 2, null));
                        mainActivity2.rule(linearLayout);
                    }
                }
                ScrollView scrollView = mainActivity2.resultScroll;
                if (scrollView != null) {
                    scrollView.scrollTo(0, 0);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LinearLayout recordRow$default(final MainActivity mainActivity, final FieldRecord fieldRecord, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit recordRow$lambda$0;
                    recordRow$lambda$0 = MainActivity.recordRow$lambda$0(MainActivity.this, fieldRecord);
                    return recordRow$lambda$0;
                }
            };
        }
        return mainActivity.recordRow(fieldRecord, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordRow$lambda$0(MainActivity mainActivity, FieldRecord fieldRecord) {
        mainActivity.rememberQuery();
        mainActivity.hideKeyboard();
        mainActivity.showRecord(fieldRecord);
        return Unit.INSTANCE;
    }

    public final LinearLayout recordRow(FieldRecord record, final Function0<Unit> onOpen) {
        Intrinsics.checkNotNullParameter(record, "record");
        Intrinsics.checkNotNullParameter(onOpen, "onOpen");
        LinearLayout row = row();
        int i = Intrinsics.areEqual(getPrefs().text("density", "compact"), "compact") ? 13 : 20;
        row.setPadding(dp((Number) 12), dp(Integer.valueOf(i)), dp((Number) 12), dp(Integer.valueOf(i)));
        row.setMinimumHeight(dp((Number) 86));
        if (!StringsKt.isBlank(record.getImage())) {
            ImageView imageView = new ImageView(this);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            imageView.setContentDescription(record.getName() + " artwork");
            int i2 = StringsKt.contains$default((CharSequence) record.getImage(), (CharSequence) "/icons/", false, 2, (Object) null) ? 40 : 68;
            row.addView(imageView, new LinearLayout.LayoutParams(dp(Integer.valueOf((getPrefs().number("iconSize", 100) * i2) / 100)), dp(Integer.valueOf(i2))));
            assetImage(record.getImage(), imageView);
        } else {
            row.addView(new EmblemView(this, getAccent()), new LinearLayout.LayoutParams(dp((Number) 38), dp((Number) 40)));
        }
        LinearLayout column = column();
        column.setPadding(dp((Number) 14), 0, dp((Number) 4), 0);
        column.addView(text$default(this, record.getName(), 16.0f, false, 0, 12, null));
        TextView text$default = text$default(this, StringsKt.take(record.getSummary(), 180), 12.0f, false, getMuted(), 4, null);
        text$default.setMaxLines(3);
        text$default.setEllipsize(TextUtils.TruncateAt.END);
        column.addView(text$default);
        String game = record.getGame();
        TextView text$default2 = text$default(this, Intrinsics.areEqual(game, "world") ? "WORLD" : Intrinsics.areEqual(game, "iceborne") ? "ICEBORNE" : "WORLD + ICEBORNE", 9.0f, false, getAccent(), 4, null);
        text$default2.setLetterSpacing(0.12f);
        text$default2.setPadding(0, dp((Number) 6), 0, 0);
        column.addView(text$default2);
        row.addView(column, new LinearLayout.LayoutParams(0, -2, 1.0f));
        touch(row, new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit recordRow$lambda$1$3;
                recordRow$lambda$1$3 = MainActivity.recordRow$lambda$1$3(Function0.this);
                return recordRow$lambda$1$3;
            }
        });
        return row;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit recordRow$lambda$1$3(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final void rememberQuery() {
        if (!getHistoryEnabled() || StringsKt.isBlank(this.searchQuery)) {
            return;
        }
        List mutableListOf = CollectionsKt.mutableListOf(StringsKt.trim((CharSequence) this.searchQuery).toString());
        int length = this.recent.length();
        for (int i = 0; i < length; i++) {
            String string = this.recent.getString(i);
            if (!Intrinsics.areEqual(string, StringsKt.trim((CharSequence) this.searchQuery).toString())) {
                mutableListOf.add(string);
            }
        }
        this.recent = new JSONArray((Collection) CollectionsKt.take(mutableListOf, 12));
        NativePrefs prefs = getPrefs();
        String jSONArray = this.recent.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
        prefs.set("recent", jSONArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showRecord$lambda$0(MainActivity mainActivity) {
        mainActivity.dismiss();
        return Unit.INSTANCE;
    }

    public final void showRecord(FieldRecord record) {
        Intrinsics.checkNotNullParameter(record, "record");
        present$default(this, "record", new RecordPanel(this, record, new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showRecord$lambda$0;
                showRecord$lambda$0 = MainActivity.showRecord$lambda$0(MainActivity.this);
                return showRecord$lambda$0;
            }
        }), 1000, false, 8, null);
    }

    public final boolean closeLibraryDetail() {
        LibraryScreen libraryScreen = this.library;
        if (libraryScreen != null) {
            return libraryScreen.closeSelection();
        }
        return false;
    }

    public static /* synthetic */ void openReference$default(MainActivity mainActivity, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        mainActivity.openReference(str, str2);
    }

    public final void openReference(final String value, final String kind) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (getCatalogue().getReady()) {
            getCatalogue().getExecutor().execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda11
                @Override // java.lang.Runnable
                public final void run() {
                    MainActivity.openReference$lambda$0(MainActivity.this, value, kind);
                }
            });
        } else {
            toast("Preparing offline catalogue…");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openReference$lambda$0(final MainActivity mainActivity, String str, String str2) {
        final List<FieldRecord> reference = mainActivity.getCatalogue().reference(str, str2);
        mainActivity.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda43
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.openReference$lambda$0$0(MainActivity.this, reference);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void openReference$lambda$0$0(MainActivity mainActivity, List list) {
        if (mainActivity.destroyed) {
            return;
        }
        int size = list.size();
        if (size == 0) {
            mainActivity.toast("No separate record is available for this reference.");
        } else if (size != 1) {
            mainActivity.showRecordList("Choose a record", list);
        } else {
            mainActivity.showRecord((FieldRecord) CollectionsKt.first(list));
        }
    }

    public final void showRecordList(String title, final List<FieldRecord> records) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(records, "records");
        LinearLayout column = column();
        column.addView(heading$default(this, title, null, 2, null));
        ListView listView = new ListView(this);
        listView.setAdapter((ListAdapter) new BaseAdapter() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$showRecordList$1
            @Override // android.widget.Adapter
            public long getItemId(int position) {
                return position;
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return records.size();
            }

            @Override // android.widget.Adapter
            public FieldRecord getItem(int position) {
                return records.get(position);
            }

            @Override // android.widget.Adapter
            public View getView(int position, View convertView, ViewGroup parent) {
                Intrinsics.checkNotNullParameter(parent, "parent");
                return MainActivity.recordRow$default(this, records.get(position), null, 2, null);
            }
        });
        column.addView(listView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        present$default(this, "saved", column, 950, false, 8, null);
    }

    public final boolean isBookmarked(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Iterable until = RangesKt.until(0, this.bookmarks.length());
        if ((until instanceof Collection) && ((Collection) until).isEmpty()) {
            return false;
        }
        Iterator it = until.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(this.bookmarks.optString(((IntIterator) it).nextInt()), id)) {
                return true;
            }
        }
        return false;
    }

    public final void toggleBookmark(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        IntRange until = RangesKt.until(0, this.bookmarks.length());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(until, 10));
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            arrayList.add(this.bookmarks.getString(((IntIterator) it).nextInt()));
        }
        List mutableList = CollectionsKt.toMutableList((Collection) arrayList);
        if (!mutableList.remove(id)) {
            mutableList.add(id);
        }
        this.bookmarks = new JSONArray((Collection) mutableList);
        NativePrefs prefs = getPrefs();
        String jSONArray = this.bookmarks.toString();
        Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
        prefs.set("bookmarks", jSONArray);
    }

    public final void reloadStoredState() {
        Object m65constructorimpl;
        Object m65constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            MainActivity mainActivity = this;
            m65constructorimpl = Result.m65constructorimpl(new JSONArray(getPrefs().text("bookmarks", "[]")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th));
        }
        JSONArray jSONArray = new JSONArray();
        if (Result.m71isFailureimpl(m65constructorimpl)) {
            m65constructorimpl = jSONArray;
        }
        this.bookmarks = (JSONArray) m65constructorimpl;
        try {
            Result.Companion companion3 = Result.INSTANCE;
            MainActivity mainActivity2 = this;
            m65constructorimpl2 = Result.m65constructorimpl(new JSONArray(getPrefs().text("recent", "[]")));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            m65constructorimpl2 = Result.m65constructorimpl(ResultKt.createFailure(th2));
        }
        JSONArray jSONArray2 = new JSONArray();
        if (Result.m71isFailureimpl(m65constructorimpl2)) {
            m65constructorimpl2 = jSONArray2;
        }
        this.recent = (JSONArray) m65constructorimpl2;
        this.libraryStates.clear();
        this.library = null;
        renderBase();
    }

    public final void importMusic(final Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        toast("Adding audio to the offline music library…");
        this.fileIo.execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda35
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.importMusic$lambda$0(MainActivity.this, uri);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (r5 == null) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void importMusic$lambda$0(final MainActivity mainActivity, Uri uri) {
        final Object m65constructorimpl;
        String str;
        Long longOrNull;
        try {
            Result.Companion companion = Result.INSTANCE;
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            File file = new File(mainActivity.getFilesDir(), "music");
            file.mkdirs();
            File file2 = new File(file, "custom-" + uuid + ".audio");
            try {
                InputStream openInputStream = mainActivity.getContentResolver().openInputStream(uri);
                Intrinsics.checkNotNull(openInputStream);
                Cursor cursor = openInputStream;
                try {
                    InputStream inputStream = cursor;
                    cursor = new FileOutputStream(file2);
                    try {
                        FileOutputStream fileOutputStream = cursor;
                        byte[] bArr = new byte[65536];
                        long j = 0;
                        while (true) {
                            int read = inputStream.read(bArr);
                            if (read >= 0) {
                                j += read;
                                if (j > 104857600) {
                                    throw new IllegalArgumentException("Choose an audio file smaller than 100 MB.".toString());
                                }
                                fileOutputStream.write(bArr, 0, read);
                            } else {
                                Unit unit = Unit.INSTANCE;
                                CloseableKt.closeFinally(cursor, null);
                                Unit unit2 = Unit.INSTANCE;
                                CloseableKt.closeFinally(cursor, null);
                                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                                try {
                                    mediaMetadataRetriever.setDataSource(file2.getPath());
                                    String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
                                    if (((extractMetadata == null || (longOrNull = StringsKt.toLongOrNull(extractMetadata)) == null) ? 0L : longOrNull.longValue()) <= 0) {
                                        throw new IllegalArgumentException("That audio format could not be opened.".toString());
                                    }
                                    mediaMetadataRetriever.release();
                                    Cursor query = mainActivity.getContentResolver().query(uri, new String[]{"_display_name"}, null, null, null);
                                    if (query != null) {
                                        cursor = query;
                                        try {
                                            Cursor cursor2 = cursor;
                                            str = cursor2.moveToFirst() ? cursor2.getString(0) : null;
                                            CloseableKt.closeFinally(cursor, null);
                                        } finally {
                                        }
                                    }
                                    str = "Imported track";
                                    m65constructorimpl = Result.m65constructorimpl(new JSONObject().put("id", uuid).put("title", StringsKt.take(str, 100)).put("file", file2.getName()));
                                } catch (Throwable th) {
                                    mediaMetadataRetriever.release();
                                    throw th;
                                }
                            }
                        }
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } catch (Exception e) {
                file2.delete();
                throw e;
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th2));
        }
        mainActivity.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda48
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.importMusic$lambda$0$1(MainActivity.this, m65constructorimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void importMusic$lambda$0$1(MainActivity mainActivity, Object obj) {
        if (mainActivity.destroyed) {
            return;
        }
        if (Result.m72isSuccessimpl(obj)) {
            JSONArray jSONArray = new JSONArray(mainActivity.getPrefs().text("tracks", "[]"));
            jSONArray.put((JSONObject) obj);
            NativePrefs prefs = mainActivity.getPrefs();
            String jSONArray2 = jSONArray.toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray2, "toString(...)");
            prefs.set("tracks", jSONArray2);
            mainActivity.toast("Audio added for offline playback.");
            SettingsPanel settingsPanel = mainActivity.settings;
            if (settingsPanel != null) {
                settingsPanel.rebuild();
            }
        }
        Throwable m68exceptionOrNullimpl = Result.m68exceptionOrNullimpl(obj);
        if (m68exceptionOrNullimpl != null) {
            String message = m68exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Could not import that audio.";
            }
            mainActivity.toast(message);
        }
    }

    public final void showCampChecklist() {
        Object m65constructorimpl;
        LinearLayout column = column();
        column.addView(heading$default(this, "Before leaving camp", null, 2, null));
        try {
            Result.Companion companion = Result.INSTANCE;
            MainActivity mainActivity = this;
            m65constructorimpl = Result.m65constructorimpl(new JSONObject(getPrefs().text("campChecks", "{}")));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m65constructorimpl = Result.m65constructorimpl(ResultKt.createFailure(th));
        }
        JSONObject jSONObject = new JSONObject();
        if (Result.m71isFailureimpl(m65constructorimpl)) {
            m65constructorimpl = jSONObject;
        }
        final JSONObject jSONObject2 = (JSONObject) m65constructorimpl;
        JSONArray jSONArray = getLibraryData().getJSONArray("checklist");
        MainActivity mainActivity2 = this;
        ScrollView scrollView = new ScrollView(mainActivity2);
        final LinearLayout column2 = column();
        LinearLayout linearLayout = column2;
        pad(linearLayout, 12);
        scrollView.addView(linearLayout);
        column.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        int length = jSONArray.length();
        for (final int i = 0; i < length; i++) {
            CheckBox checkBox = new CheckBox(mainActivity2);
            checkBox.setText(jSONArray.getString(i));
            checkBox.setTextColor(getInk());
            checkBox.setChecked(jSONObject2.optBoolean(String.valueOf(i)));
            checkBox.setMinHeight(dp((Number) 50));
            checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda22
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                    MainActivity.showCampChecklist$lambda$1$0(jSONObject2, i, this, compoundButton, z);
                }
            });
            column2.addView(checkBox);
        }
        column.addView(button("Clear camp checklist", new Function0() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda33
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit showCampChecklist$lambda$2;
                showCampChecklist$lambda$2 = MainActivity.showCampChecklist$lambda$2(MainActivity.this, column2);
                return showCampChecklist$lambda$2;
            }
        }));
        present$default(this, "checklist", column, 650, false, 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showCampChecklist$lambda$1$0(JSONObject jSONObject, int i, MainActivity mainActivity, CompoundButton compoundButton, boolean z) {
        Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
        jSONObject.put(String.valueOf(i), z);
        NativePrefs prefs = mainActivity.getPrefs();
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "toString(...)");
        prefs.set("campChecks", jSONObject2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showCampChecklist$lambda$2(MainActivity mainActivity, LinearLayout linearLayout) {
        mainActivity.getPrefs().set("campChecks", "{}");
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            CheckBox checkBox = childAt instanceof CheckBox ? (CheckBox) childAt : null;
            if (checkBox != null) {
                checkBox.setChecked(false);
            }
        }
        return Unit.INSTANCE;
    }

    private final String readable(final Object value) {
        if (value instanceof JSONArray) {
            return CollectionsKt.joinToString$default(RangesKt.until(0, ((JSONArray) value).length()), " · ", null, null, 0, null, new Function1() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda40
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CharSequence readable$lambda$0;
                    readable$lambda$0 = MainActivity.readable$lambda$0(MainActivity.this, value, ((Integer) obj).intValue());
                    return readable$lambda$0;
                }
            }, 30, null);
        }
        if (!(value instanceof JSONObject)) {
            return value.toString();
        }
        Iterator<String> keys = ((JSONObject) value).keys();
        Intrinsics.checkNotNullExpressionValue(keys, "keys(...)");
        return SequencesKt.joinToString$default(SequencesKt.filter(SequencesKt.asSequence(keys), new Function1() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda41
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean readable$lambda$1;
                readable$lambda$1 = MainActivity.readable$lambda$1(value, (String) obj);
                return Boolean.valueOf(readable$lambda$1);
            }
        }), " · ", null, null, 0, null, new Function1() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda42
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence readable$lambda$2;
                readable$lambda$2 = MainActivity.readable$lambda$2(MainActivity.this, value, (String) obj);
                return readable$lambda$2;
            }
        }, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence readable$lambda$0(MainActivity mainActivity, Object obj, int i) {
        Object obj2 = ((JSONArray) obj).get(i);
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return mainActivity.readable(obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean readable$lambda$1(Object obj, String str) {
        JSONObject jSONObject = (JSONObject) obj;
        return (Intrinsics.areEqual(jSONObject.opt(str), JSONObject.NULL) || Intrinsics.areEqual(jSONObject.opt(str).toString(), "0")) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence readable$lambda$2(MainActivity mainActivity, Object obj, String str) {
        String str2;
        Intrinsics.checkNotNull(str);
        if (str.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String valueOf = String.valueOf(str.charAt(0));
            Intrinsics.checkNotNull(valueOf, "null cannot be cast to non-null type java.lang.String");
            String upperCase = valueOf.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            StringBuilder append = sb.append((Object) upperCase);
            String substring = str.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            str2 = append.append(substring).toString();
        } else {
            str2 = str;
        }
        Object obj2 = ((JSONObject) obj).get(str);
        Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
        return str2 + ": " + mainActivity.readable(obj2);
    }

    private final void showSaved() {
        LinearLayout column = column();
        column.addView(heading$default(this, "Saved entries", null, 2, null));
        rule(column);
        ScrollView scrollView = new ScrollView(this);
        final LinearLayout column2 = column();
        LinearLayout linearLayout = column2;
        pad$default(this, linearLayout, 0, 2, null);
        scrollView.addView(linearLayout);
        column.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        if (!getCatalogue().getReady()) {
            column2.addView(text$default(this, "Preparing saved entries…", 14.0f, false, 0, 12, null));
            present$default(this, "saved", column, 0, false, 12, null);
        } else {
            if (this.bookmarks.length() == 0) {
                column2.addView(text$default(this, "No bookmarks yet. Search for a record to save it.", 14.0f, false, getMuted(), 4, null));
            } else {
                getCatalogue().getExecutor().execute(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda47
                    @Override // java.lang.Runnable
                    public final void run() {
                        MainActivity.showSaved$lambda$0(MainActivity.this, column2);
                    }
                });
            }
            present$default(this, "saved", column, 0, false, 12, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSaved$lambda$0(final MainActivity mainActivity, final LinearLayout linearLayout) {
        IntRange until = RangesKt.until(0, mainActivity.bookmarks.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = until.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            Catalogue catalogue = mainActivity.getCatalogue();
            String string = mainActivity.bookmarks.getString(nextInt);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            FieldRecord record = catalogue.record(string);
            if (record != null) {
                arrayList.add(record);
            }
        }
        final ArrayList arrayList2 = arrayList;
        mainActivity.runOnUiThread(new Runnable() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda50
            @Override // java.lang.Runnable
            public final void run() {
                MainActivity.showSaved$lambda$0$1(MainActivity.this, arrayList2, linearLayout);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showSaved$lambda$0$1(MainActivity mainActivity, List list, LinearLayout linearLayout) {
        if (mainActivity.destroyed) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linearLayout.addView(recordRow$default(mainActivity, (FieldRecord) it.next(), null, 2, null));
        }
    }

    public final void showCredits() {
        String str;
        MainActivity mainActivity = this;
        LinearLayout column = mainActivity.column();
        column.addView(heading$default(mainActivity, "Sources & credits", null, 2, null));
        mainActivity.rule(column);
        ScrollView scrollView = new ScrollView(mainActivity);
        LinearLayout column2 = mainActivity.column();
        LinearLayout linearLayout = column2;
        mainActivity.pad(linearLayout, 20);
        scrollView.addView(linearLayout);
        column.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        column2.addView(text$default(mainActivity, "Unofficial fan project. Monster Hunter game material belongs to Capcom and the respective rights holders.\n\nNative Kotlin milestone 0.2.0\nSource data and artwork are retained from the completed HTML guide.", 14.0f, false, 0, 12, null));
        gap$default(mainActivity, column2, 0, 2, null);
        InputStream open = mainActivity.getAssets().open("credits.json");
        Intrinsics.checkNotNullExpressionValue(open, "open(...)");
        Reader inputStreamReader = new InputStreamReader(open, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, ConstantsKt.DEFAULT_BUFFER_SIZE);
        try {
            JSONObject jSONObject = new JSONObject(TextStreamsKt.readText(bufferedReader));
            CloseableKt.closeFinally(bufferedReader, null);
            JSONArray optJSONArray = jSONObject.optJSONArray("sources");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
            }
            JSONArray jSONArray = optJSONArray;
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                String optString = jSONObject2.optString("name");
                Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
                column2.addView(text$default(mainActivity, optString, 14.0f, false, mainActivity.getAccent(), 4, null));
                String optString2 = jSONObject2.optString("url");
                Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
                mainActivity = this;
                column2.addView(text$default(mainActivity, optString2, 11.0f, false, getMuted(), 4, null));
                mainActivity.gap(column2, 12);
            }
            JSONObject optJSONObject = jSONObject.optJSONObject("iconLicense");
            if (optJSONObject == null || (str = optJSONObject.optString("licenseText")) == null) {
                str = "";
            }
            column2.addView(text$default(mainActivity, str, 10.0f, false, mainActivity.getMuted(), 4, null));
            gap$default(mainActivity, column2, 0, 2, null);
            String optString3 = jSONObject.optString("databaseLicense");
            Intrinsics.checkNotNullExpressionValue(optString3, "optString(...)");
            column2.addView(text$default(mainActivity, optString3, 10.0f, false, mainActivity.getMuted(), 4, null));
            gap$default(mainActivity, column2, 0, 2, null);
            String optString4 = jSONObject.optString("fontLicense");
            Intrinsics.checkNotNullExpressionValue(optString4, "optString(...)");
            column2.addView(text$default(mainActivity, optString4, 10.0f, false, mainActivity.getMuted(), 4, null));
            present$default(this, "credits", column, 0, false, 12, null);
        } finally {
        }
    }

    @Override // android.app.Activity
    @Deprecated(message = "Activity result supports Android 7+")
    protected void onActivityResult(int request, int result, Intent data) {
        super.onActivityResult(request, result, data);
        getBackups().onResult(request, result, data);
    }

    @Override // android.app.Activity
    @Deprecated(message = "Back handling supports Android 7+")
    public void onBackPressed() {
        if (this.introDone) {
            if (!this.overlays.isEmpty()) {
                dismiss();
                return;
            }
            if (closeLibraryDetail()) {
                return;
            }
            if (!this.sectionHistory.isEmpty()) {
                String removeLast = this.sectionHistory.removeLast();
                Intrinsics.checkNotNullExpressionValue(removeLast, "removeLast(...)");
                navigate(removeLast, false);
            } else if (!Intrinsics.areEqual(this.activeSection, "overview")) {
                navigate("overview", false);
            } else if (NativePrefs.flag$default(getPrefs(), "confirmExit", false, 2, null)) {
                new AlertDialog.Builder(this).setTitle("Leave Field Book?").setMessage("Your settings and bookmarks are saved on this device.").setNegativeButton("Stay", (DialogInterface.OnClickListener) null).setPositiveButton("Exit", new DialogInterface.OnClickListener() { // from class: com.lumina.monsterhunterfieldbook.MainActivity$$ExternalSyntheticLambda37
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        MainActivity.this.finish();
                    }
                }).show();
            } else {
                finish();
            }
        }
    }
}
